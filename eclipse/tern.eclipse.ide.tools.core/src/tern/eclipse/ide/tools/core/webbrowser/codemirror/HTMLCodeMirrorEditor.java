package tern.eclipse.ide.tools.core.webbrowser.codemirror;

public class HTMLCodeMirrorEditor implements tern.eclipse.ide.tools.core.generator.IGenerator
 {
  protected static String nl;
  public static synchronized HTMLCodeMirrorEditor create(String lineSeparator)
  {
    nl = lineSeparator;
    HTMLCodeMirrorEditor result = new HTMLCodeMirrorEditor();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<!DOCTYPE html>" + NL + "<html>" + NL + "<head>" + NL + "\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />" + NL + "\t<title>Tern - CodeMirror Editor</title>" + NL + "\t<!-- Tern JS -->" + NL + "\t<script src=\"";
  protected final String TEXT_2 = "\"></script>" + NL + "\t<script src=\"\t";
  protected final String TEXT_3 = "\"></script>" + NL + "\t<script src=\"";
  protected final String TEXT_4 = "\"></script>" + NL + "\t<script src=\"";
  protected final String TEXT_5 = "\"></script>" + NL + "\t<script src=\"";
  protected final String TEXT_6 = "\"></script>" + NL + "\t<script src=\"";
  protected final String TEXT_7 = "\"></script>" + NL + "\t<script src=\"";
  protected final String TEXT_8 = "\"></script>" + NL + "\t<script src=\"";
  protected final String TEXT_9 = "\"></script>\t\t" + NL + "\t<!-- CodeMirror -->" + NL + "\t<link rel=stylesheet href=\"";
  protected final String TEXT_10 = "\">" + NL + "\t<link rel=stylesheet href=\"";
  protected final String TEXT_11 = "\">" + NL + "\t<script src=\"";
  protected final String TEXT_12 = "\"></script>" + NL + "\t<script src=\"";
  protected final String TEXT_13 = "\"></script>" + NL + "\t<link rel=stylesheet href=\"";
  protected final String TEXT_14 = "\">" + NL + "\t<script src=\"";
  protected final String TEXT_15 = "\"></script>" + NL + "\t<!-- CodeMirror & Tern -->" + NL + "\t <script src=\"";
  protected final String TEXT_16 = "\"></script>" + NL + "</head>" + NL + "<body>" + NL + "\t<p>" + NL + "\t\t<textarea id=\"code\" name=\"code\">";
  protected final String TEXT_17 = "</textarea>" + NL + "\t</p>" + NL + "\t<dl>" + NL + "\t  <dt>Ctrl-Space</dt><dd>Autocomplete</dd>" + NL + "\t  <dt>Ctrl-I</dt><dd>Find type at cursor</dd>" + NL + "\t  <dt>Alt-.</dt><dd>Jump to definition (Alt-, to jump back)</dd>" + NL + "\t  <dt>Ctrl-Q</dt><dd>Rename variable</dd>" + NL + "\t</dl>\t" + NL + "\t<script>" + NL + "\t\tvar editor = CodeMirror.fromTextArea(document.getElementById(\"code\"), {" + NL + "    \t\tlineNumbers: true," + NL + "    \t\tmode: \"javascript\"" + NL + "  \t\t});" + NL + "  \t\tvar defs = [];" + NL + "\t\tvar server = new CodeMirror.TernServer({defs: defs, plugins:{\"aui\":\"../\"}});" + NL + "\t    editor.setOption(\"extraKeys\", {" + NL + "\t      \"Ctrl-Space\": function(cm) { server.complete(cm); }," + NL + "\t      \"Ctrl-I\": function(cm) { server.showType(cm); }," + NL + "\t      \"Alt-.\": function(cm) { server.jumpToDef(cm); }," + NL + "\t      \"Alt-,\": function(cm) { server.jumpBack(cm); }," + NL + "\t      \"Ctrl-Q\": function(cm) { server.rename(cm); }," + NL + "\t    })" + NL + "\t    editor.on(\"cursorActivity\", function(cm) { server.updateArgHints(cm); });  \t\t" + NL + "\t</script>" + NL + "</body>" + NL + "</html>";
  protected final String TEXT_18 = NL;

/* (non-javadoc)
    * @see IGenerator#generate(Object)
    */
public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     CodeMirrorOptions options = (CodeMirrorOptions)argument; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(options.resolveTern("node_modules/acorn/acorn.js") );
    stringBuffer.append(TEXT_2);
    stringBuffer.append(options.resolveTern("node_modules/acorn/acorn_loose.js") );
    stringBuffer.append(TEXT_3);
    stringBuffer.append(options.resolveTern("node_modules/acorn/util/walk.js") );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(options.resolveTern("lib/signal.js") );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(options.resolveTern("lib/tern.js") );
    stringBuffer.append(TEXT_6);
    stringBuffer.append(options.resolveTern("lib/def.js") );
    stringBuffer.append(TEXT_7);
    stringBuffer.append(options.resolveTern("lib/comment.js") );
    stringBuffer.append(TEXT_8);
    stringBuffer.append(options.resolveTern("lib/infer.js") );
    stringBuffer.append(TEXT_9);
    stringBuffer.append(options.resolve("lib/codemirror.css") );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(options.resolve("doc/docs.css") );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(options.resolve("lib/codemirror.js") );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(options.resolve("mode/javascript/javascript.js") );
    stringBuffer.append(TEXT_13);
    stringBuffer.append(options.resolve("addon/hint/show-hint.css") );
    stringBuffer.append(TEXT_14);
    stringBuffer.append(options.resolve("addon/hint/show-hint.js") );
    stringBuffer.append(TEXT_15);
    stringBuffer.append(options.resolve("addon/tern/tern.js") );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( options.getEditorContent() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append(TEXT_18);
    return stringBuffer.toString();
  }
}
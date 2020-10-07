import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {


        java.lang.String text =
                "<html dir=\"rtl\" lang=\"fa\" class=\" js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths\" style=\"transform: none;\"><head><style class=\"vjs-styles-defaults\">\n" +
                        "<div class=\"yn-grid yn-borderbox\">\n" +
                        "        <div class=\"yn-item vertical yn-clearfix\">\n" +
                        "            <div class=\"yn-item_image_wrapper\">\n" +
                        "                <img class=\"yn-item_image\" alt=\"خرید لایسنس اصلی ویندوز\" sizes=\"198px\" srcset=\"https://native.yektanet.com/static/media/upload/CACHE/images/items/image__1blKjzUWG4/90/150x100.jpeg 150w,\n" +
                        "                <p class=\"yn-item_title\">\n" +
                        "                    بازم به بانی مد سر بزن، پوشاک پاییزه رو با تخفیف بخر!\n" +
                        "                </p>\n" +
                        "            </div>\n" +
                        "        </div>\n" +
                        "    </a>\n" +
                        "</div>\n" +
                        "            <div class=\"yn-item_image_wrapper\">\n" +
                        "                <img class=\"yn-item_image\" alt=\"هودی مردانه جامه پوش آرا JPA\" src=\"https://prod.yektanet.com/media/images/thumbnails/300x200/762/027558607df04d1c9ae04d439bbba072.jpg\">\n" +
                        "                \n" +
                        "            </div>\n" +
                        "            <div class=\"yn-item_title_wrapper yn-borderbox\">\n" +
                        "                <p class=\"yn-item_title\">\n" +
                        "                    هودی مردانه جامه پوش آرا JPA\n" +
                        "                </p>\n" +
                        "            </div>\n" +
                        "        </div>\n" +
                        "    </a>\n" +
                        "</div>\n" +
                        "        <div class=\"yn-item vertical yn-clearfix\">\n" +
                        "            <div class=\"yn-item_image_wrapper\">\n" +
                        "                <img class=\"yn-item_image\" alt=\"پلیور مردانه یقه هفت ساده جوتی&zwnj;جینز Jootijeans\" src=\"://prod.yektanet.com/media/images/thumbnails/300x200/762/ba8d5215b51e4c46b53cc09d2f0f992e.jpg\">\n" +
                        "                \n" +
                        "</div></div><!--/ko--> <!--ko if: onBannerCompleted(80221)--><!--/ko--></div></div><div itemprop=\"articleBody\" class=\"article-section\"><div id=\"bodyContainer\"><p>براساس گزارش&zwnj;های منتشرشده، با ترکیب دو حفره&zwnj;ی امنیتی که درواقع برای <a href=\"/jailbreak/\">جیلبریک&zwnj;</a>&zwnj;کردن <a href=\"/iphone/\">آیفون </a> توسعه داده شده بود، می&zwnj;توان تراشه&zwnj;ی امنیتی T2 را هم جیلبریک کرد. این حفره&zwnj;های امنیتی بسیار پیچیده هستند و هکرها با استفاده از شیوه&zwnj;های مختلف توانسته&zwnj;اند این دو حفره را باهم ترکیب کنند و راهی جدید برای جیلبریک&zwnj" +
                        ";کردن سیستم امنیتی <a href=\"/apple/\">اپل </a> پیدا کنند. بسیاری از حرفه&zwnj;ای&zwnj;های جیلبریک محصولات اپل این روش جدید را آزمایش کرده&zwnj;اند و گفته&zwnj;اند که می&zwnj;توان تراشه&zwnj;ی T2 را جیلبریک کرد. البته به این موضوع هم اشاره کرده&zwnj;اند &zwnj;که روند این کار بسیار پیچیده است و زمان زیادی می&zwnj;برد.</p><p>اگر روند جیلبریک به&zwnj;خوبی انجام شود، کاربران یا حتی هکرها می&zwnj;توانند کنترل کامل سیستم را دراختیار بگیرند و حتی می&zwnj;توانند هسته&zwnj;ی&nbsp;<a href=\"/category/os/\">سیستم&zwnj;عامل " +
                        "</a> را هم دست&zwnj;کاری کنند. همچنین، می&zwnj;توان با این روش به اطلاعات رمزنگاری&zwnj;شده دسترسی پیدا کرد و می&zwnj;توان روی سیستم بدافزار قرار داد.</p><p>تراشه&zwnj;ی T2 درکنار <a href=\"/category/processor/\">پردازنده </a> <a href=\"/intel/\">اینتل</a>&nbsp;روی سیستم&zwnj;های مک، مک پرو، مک&zwnj;مینی و <a href=\"/product/list/laptop/apple/\" target=\"_blank\">مک بوک</a> قرار می&zwnj;گیرد. در سال ۲۰۱۷، این تراشه معرفی شد و در سال ۲۰۱۸، روی سیستم&zwnj;های اپل قرار گرفت. تراشه&zwnj;ی دوم کاملا مستقل از <a href=\"/product/list/cpu/\" target=\"_blank\">پردازنده </a>اصلی کار می&zwnj;کند و وظیفه&zwnj;ی پردازش صدا و برخی از ورودی&zwnj;ها و خروجی را برعهده دارد تا بتواند کمی از فشار واردشده روی پردازنده اصلی را کم کند. بااین&zwnj;حال این تراشه به&zwnj;عنوان تراشه&zwnj;ی امنیتی هم کار می&zwnj;کند. وظیفه&zwnj;ی تراشه&zwnj;ی T2&nbsp;<span>رمزگذاری اطلاعات بسیار مهم کاربران ازجمله رمزعبور یا تاچ آی&zwnj;دی است. درواقع، این تراشه نقش مهمی در محصولات جدید اپل ایفا می&zwnj" +
                        ";کند و جیلبریک&zwnj;شدن آن ممکن است خطر زیادی برای کاربران ایجاد کند.</span></p></div><div class=\"beforesource\"><hr><div class=\"narrow\"><div class=\"center-block social-footer\"><div class=\"col-xs-12 col-md-6 pad15B\"><a href=\"instagram.com/thezoomit\" target=\"_blank\" rel=\"nofollow\"><img class=\"img-responsive\" src=\".zoomit.ir/2020/7/bfd6fe07-3452-4953-babf-dec6927181e7.png\" alt=\"اینستاگرام زومیت\"></a></div><div class=\"col-xs-12 col-md-6\"><a href=\"t.me/thezoomit\" target=\"_blank\" rel=\"nofollow\"><img class=\"img-responsive\" src=\"cdn01.zoomit.ir/2020/7/56bc8c05-b099-4b50-8254-2484dfecfa01.png\" alt=\"تلگرام زومیت\"></a></div></div></div></div><div class=\"relatedapepnt\"><h4 class=\"related-header\"><span class=\"related-inner\">بیشتر بخوانید: </span></h4><div class=\"relatedtopicitem\">" +
                        "<a href=\"//www.zoomit.ir/exhibition/363541-apple-iphone-12-hi-speed-event-mehr-22-official/\" onclick=\"if (!window.__cfRLUnblockHandlers) return false; ga('send','event','InternalRelatedItems','Click','اپل ۲۲ مهر رویداد Hi, Speed را برای رونمایی آیفون ۱۲ برگزار می&zwnj;کند')\"> اپل ۲۲ مهر رویداد Hi, Speed را برای رونمایی آیفون ۱۲ برگزار می&zwnj;کند </a></div><div class=\"relatedtopicitem\"><a href=\"://www.zoomit.ir/tech/363519-apple-no-longer-sells-third-party-audio-accessories/\" onclick=\"if (!window.__cfRLUnblockHandlers) return false; ga('send','event','InternalRelatedItems','Click','اپل فروش محصولات صوتی برندهای دیگر را در فروشگاه&zwnj;&zwnj;هایش متوقف کرد')\"> اپل فروش محصولات صوتی برندهای دیگر را در فروشگاه&zwnj;&zwnj;هایش متوقف کرد </a></div><div class=\"relatedtopicitem\"><a href=\"://www.zoomit.ir/security/363512-john-mcafee-arrested-spain-usa-extradition/\"" +
                        " onclick=\"if (!window.__cfRLUnblockHandlers) return false; ga('send','event','InternalRelatedItems','Click','جان مک&zwnj;آفی در اسپانیا دستگیر شد؛ استرداد به آمریکا در آینده&zwnj;ای نزدیک')\"> جان مک&zwnj;آفی در اسپانیا دستگیر شد؛ استرداد به آمریکا در آینده&zwnj;ای نزدیک </a></div><div class=\"relatedtopicitem\"><a href=\"://www.zoomit.ir/tech/363507-in-memory-of-steve-jobs/\" onclick=\"if (!window.__cfRLUnblockHandlers) return false; ga('send','event','InternalRelatedItems','Click','توییت تیم کوک به&zwnj;مناسبت نهمین سالگرد درگذشت استیو جابز')\"> توییت تیم کوک به&zwnj;مناسبت نهمین سالگرد درگذشت استیو جابز </a></div><div class=\"relatedtopicitem\"><a href=\"://www.zoomit.ir/unboxing/363499-apple-ipad-magic-keyboard-unboxing-and-handson-video/\"" +
                        " onclick=\"if (!window.__cfRLUnblockHandlers) return false; ga('send','event','InternalRelatedItems'," +
                        "'Click','جعبه گشایی و نگاه نزدیک به مجیک کیبورد آیپد پرو')\"> جعبه گشایی و نگاه نزدیک به مجیک کیبورد آیپد پرو </a></div></div></div><div class=\"article-source-row\"><div><span class=\"label label-danger\"> منبع</span> <a href=\"://www.zdnet.com/article/hackers-claim-they-can-now-jailbreak-apples-t2-security-chip/#ftag=RSSbaffb68\" class=\"label label-default\" " +

                        "            </div>\n" +
                        "            <div class=\"yn-item_title_wrapper yn-borderbox\">\n" +
                        "                <p class=\"yn-item_title\">\n" +
                        "                    پلیور مردانه یقه هفت ساده جوتی&zwnj;جینز Jootijeans\n" +
                        "                </p>\n" +
                        "            </div>\n" +
                        "        </div>\n" +
                        "    </a>\n" +
                        "</div>\n" +
                        "<div class=\"yn-grid yn-borderbox\" style=\"width: 0; height: 0; display: block!important; overflow: hidden; opacity: 0;\">\n" +
                        "                <img class=\"yn-item_image\" alt=\"خرید لایسنس اصلی ویندوز\" sizes=\"198px\" srcset=\"https://native.yektanet.com/static/media/upload/CACHE/images/items/image__1blKjzUWG4/90/150x100.jpeg 150w,\n" +
                        "                https://native.yektanet.com/static/media/upload/CACHE/images/items/image__1blKjzUWG4/90/225x150.jpeg 225w,\n" +
                        "                https://native.yektanet.com/static/media/upload/CACHE/images/items/image__1blKjzUWG4/90/300x200.jpeg 300w,\n" +
                        "                https://native.yektanet.com/static/media/upload/CACHE/images/items/image__1blKjzUWG4/90/375x250.jpeg 375w,\n" +
                        "                \n" +
                        "            </div>\n" +
                        "            <div class=\"yn-item_title_wrapper yn-borderbox\">\n" +
                        "                <p class=\"yn-item_title\">\n" +
                        "                    خرید لایسنس اصلی ویندوز\n" +
                        "                </p>\n" +
                        "            </div>\n" +
                        "        </div>\n" +
                        "    </a>\n" +
                        "</div>\n" +
                        "        <div class=\"yn-item vertical yn-clearfix\">\n" +
                        "            <div class=\"yn-item_image_wrapper\">\n" +
                        "                <img class=\"yn-item_image\" alt=\"از بازی لذت ببر و درآمد کسب کن!\" sizes=\"198px\" srcset=\"https://native.yektanet.com/static/media/upload/CACHE/images/items/image__1blKonR4pu/90/150x100.jpeg 150w,\n" +
                        "            </div>\n" +
                        "            <div class=\"yn-item_title_wrapper yn-borderbox\">\n" +
                        "                <p class=\"yn-item_title\">\n" +
                        "                    از بازی لذت ببر و درآمد کسب کن!\n" +
                        "                </p>\n" +
                        "            </div>\n" +
                        "        </div>\n" +
                        "    </a>\n" +
                        "</div>\n" +
                        "        <div class=\"yn-item vertical yn-clearfix\">\n" +
                        "            <div class=\"yn-item_image_wrapper\">\n" +
                        "                <img class=\"yn-item_image\" alt=\"هاست وردپرس سرورپارس، 24 برابر سریعتر با هارد NVMe\" sizes=\"198px\" srcset=\"https://native.yektanet.com/static/media/upload/CACHE/images/items/600.400__1b2zP1PIww/90/150x100.jpg 150w,\n" +
                        "                https://native.yektanet.com/static/media/upload/CACHE/images/items/600.400__1b2zP1PIww/90/225x150.jpg 225w,\n" +
                        "                https://native.yektanet.com/static/media/upload/CACHE/images/items/600.400__1b2zP1PIww/90/300x200.jpg 300w,\n" +
                        "                https://native.yektanet.com/static/media/upload/CACHE/images/items/600.400__1b2zP1PIww/90/375x250.jpg 375w,\n" +
                        "</div></div><div class=\"banner-wrapper\"><span style=\"display:none\" data-bind=\"text:id\">402</span><div data-bind=\"html: displayBody \" class=\"banner\" data-banner=\"\"><!--noEditor-->\n" +
                        "<div><a href=\"https://affstat.adro.co/click/5a1025c4-c4f8-4e31-86ba-2d877f48bf14\" target=\"_blank\" rel=\"nofollow\"><img class=\"img-responsive Tabligh\" id=\"B2-AffiliateDigikalaMen\" src=\"https://cdn01.zoomit.ir/2020/3/9590a803-d8b3-4ca5-a21a-576e5eb23f82.gif\" alt=\"\"></a></div></div></div><div class=\"banner-wrapper\"><span style=\"display:none\" data-bind=\"text:id\">496</span><div data-bind=\"html: displayBody \" class=\"banner\" data-banner=\"\"><!--noEditor-->\n" +
                        "<div><a href=\"https://mrbilit.com/\" target=\"_blank\" rel=\"nofollow\"><img class=\"img-responsive Tabligh\" id=\"D2-MrBlit\" src=\"https://cdn01.zoomit.ir/2020/9/banner-mrblit-300x250.gif\" alt=\"بنر :: مستربلیط\"></a></div></div></div><div class=\"banner-wrapper\"><span style=\"display:none\" data-bind=\"text:id\">365</span><div data-bind=\"html: displayBody \" class=\"banner\" data-banner=\"\"><!--noEditor-->\n" +
                        "<div><a href=\"http://yun.ir/jol8ea\" target=\"_blank\" rel=\"nofollow\"> <img class=\"img-responsive center-block Tabligh\" id=\"d3-Avang\" src=\"https://cdn01.zoomit.ir/2020/7/2a07f19b-8147-4c30-82b8-6a9abdd31a82.gif\"></a></div></div></div><div class=\"banner-wrapper\"><span style=\"display:none\" data-bind=\"text:id\">491</span><div data-bind=\"html: displayBody \" class=\"banner\" data-banner=\"\"><!--noEditor-->\n" +
                        "<div><a href=\"https://fourteamit.com/minipc-hatron/?utm_source=zoomit&amp;utm_medium=banner&amp;utm_campaign=sum99&amp;utm_content=minipc&amp;utm_term=d3\" target=\"_blank\" rel=\"nofollow\"><img class=\"img-responsive Tabligh\" id=\"D3-Hatron\" src=\"https://cdn01.zoomit.ir/2020/8/banner-hatron-300x250.gif\" alt=\"\"></a></div></div></div><div class=\"banner-wrapper\"><span style=\"display:none\" data-bind=\"text:id\">426</span><div data-bind=\"html: displayBody \" class=\"banner\" data-banner=\"\"><!--noEditor-->\n";

        //Search for paragraphs in HTML
        String patternString = "(<p>)(.+)(</p>)";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group(2));
        }

        //Search for links with .com domain
        String patternStringOne = "(https://.*\\.com)";
        Pattern patternOne = Pattern.compile(patternStringOne);
        Matcher matcherOne = patternOne.matcher(text);

        HashMap<String, Integer> linksCount = new HashMap<>();
        while (matcherOne.find()) {
            String link = matcherOne.group(1);
            if (linksCount.containsKey(link)) {
                linksCount.put(link, linksCount.get(link) + 1);
            } else {
                linksCount.put(link, 1);
            }
        }
        for (String link : linksCount.keySet()) {
            System.out.println(link + " : " + linksCount.get(link));
        }

    }
}
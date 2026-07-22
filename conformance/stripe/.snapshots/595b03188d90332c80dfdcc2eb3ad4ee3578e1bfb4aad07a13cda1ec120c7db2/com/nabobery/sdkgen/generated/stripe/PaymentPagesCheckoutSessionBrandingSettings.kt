package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_branding_settings
 */
@Serializable(with = PaymentPagesCheckoutSessionBrandingSettings.Serializer::class)
public class PaymentPagesCheckoutSessionBrandingSettings(
    /**
     * A hex color value starting with `#` representing the background color for the Checkout Session.
     */
    public val backgroundColor: String,
    /**
     * The border style for the Checkout Session. Must be one of `rounded`, `rectangular`, or `pill`.
     */
    public val borderStyle: InlinePaymentPagesCheckoutSessionBrandingSettingsBorderStyleXb8fbbe66,
    /**
     * A hex color value starting with `#` representing the button color for the Checkout Session.
     */
    public val buttonColor: String,
    /**
     * The display name shown on the Checkout Session.
     */
    public val displayName: String,
    /**
     * The font family for the Checkout Session. Must be one of the [supported font
     * families](https://docs.stripe.com/payments/checkout/customization/appearance?payment-ui=stripe-hosted#font-compatib
     * ility).
     */
    public val fontFamily: String,
    /**
     * The icon for the Checkout Session. You cannot set both `logo` and `icon`.
     */
    public val icon: InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01? = null,
    /**
     * The logo for the Checkout Session. You cannot set both `logo` and `icon`.
     */
    public val logo: InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8? = null,
) {
    public class Builder {
        private var backgroundColorValue: String? = null

        public var backgroundColor: String
            get() = requireNotNull(backgroundColorValue) { "backgroundColor is required" }
            set(`value`) {
                backgroundColorValue = value
            }

        private var borderStyleValue:
            InlinePaymentPagesCheckoutSessionBrandingSettingsBorderStyleXb8fbbe66? = null

        public var borderStyle: InlinePaymentPagesCheckoutSessionBrandingSettingsBorderStyleXb8fbbe66
            get() = requireNotNull(borderStyleValue) { "borderStyle is required" }
            set(`value`) {
                borderStyleValue = value
            }

        private var buttonColorValue: String? = null

        public var buttonColor: String
            get() = requireNotNull(buttonColorValue) { "buttonColor is required" }
            set(`value`) {
                buttonColorValue = value
            }

        private var displayNameValue: String? = null

        public var displayName: String
            get() = requireNotNull(displayNameValue) { "displayName is required" }
            set(`value`) {
                displayNameValue = value
            }

        private var fontFamilyValue: String? = null

        public var fontFamily: String
            get() = requireNotNull(fontFamilyValue) { "fontFamily is required" }
            set(`value`) {
                fontFamilyValue = value
            }

        /**
         * The icon for the Checkout Session. You cannot set both `logo` and `icon`.
         */
        public var icon: InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01? = null

        /**
         * The logo for the Checkout Session. You cannot set both `logo` and `icon`.
         */
        public var logo: InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8? = null

        public fun build(): PaymentPagesCheckoutSessionBrandingSettings {
            check(backgroundColorValue != null) { "backgroundColor is required" }
            check(borderStyleValue != null) { "borderStyle is required" }
            check(buttonColorValue != null) { "buttonColor is required" }
            check(displayNameValue != null) { "displayName is required" }
            check(fontFamilyValue != null) { "fontFamily is required" }
            return PaymentPagesCheckoutSessionBrandingSettings(
                backgroundColor = backgroundColor,
                borderStyle = borderStyle,
                buttonColor = buttonColor,
                displayName = displayName,
                fontFamily = fontFamily,
                icon = icon,
                logo = logo,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionBrandingSettings =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentPagesCheckoutSessionBrandingSettings> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionBrandingSettings {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionBrandingSettings")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentPagesCheckoutSessionBrandingSettings must be a JSON object")
            val backgroundColor = json.decodeRequired<String>(rawObject, "background_color")
            val borderStyle =
                json.decodeRequired<InlinePaymentPagesCheckoutSessionBrandingSettingsBorderStyleXb8fbbe66>(
                    rawObject,
                    "border_style",
                )
            val buttonColor = json.decodeRequired<String>(rawObject, "button_color")
            val displayName = json.decodeRequired<String>(rawObject, "display_name")
            val fontFamily = json.decodeRequired<String>(rawObject, "font_family")
            return PaymentPagesCheckoutSessionBrandingSettings(
                backgroundColor = backgroundColor,
                borderStyle = borderStyle,
                buttonColor = buttonColor,
                displayName = displayName,
                fontFamily = fontFamily,
                icon =
                    rawObject["icon"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentPagesCheckoutSessionBrandingSettingsIconX69a9ee01?>(
                                element,
                            )
                        }
                    },
                logo =
                    rawObject["logo"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentPagesCheckoutSessionBrandingSettingsLogoX7c08eac8?>(
                                element,
                            )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentPagesCheckoutSessionBrandingSettings,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionBrandingSettings")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("background_color", value.backgroundColor)
                    put("border_style", json.encodeToJsonElement(value.borderStyle))
                    put("button_color", value.buttonColor)
                    put("display_name", value.displayName)
                    put("font_family", value.fontFamily)
                    value.icon?.let { put("icon", json.encodeToJsonElement(it)) }
                    value.logo?.let { put("logo", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentPagesCheckoutSessionBrandingSettings(
    block: PaymentPagesCheckoutSessionBrandingSettings.Builder.() -> Unit,
): PaymentPagesCheckoutSessionBrandingSettings = PaymentPagesCheckoutSessionBrandingSettings.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentPagesCheckoutSessionBrandingSettings is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}

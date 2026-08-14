package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.json#/components/schemas/source_type_klarna.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_type_klarna
 */
@Serializable(with = SourceTypeKlarna.Serializer::class)
public class SourceTypeKlarna(
  public val backgroundImageUrl: String? = null,
  public val clientToken: String? = null,
  public val firstName: String? = null,
  public val lastName: String? = null,
  public val locale: String? = null,
  public val logoUrl: String? = null,
  public val pageTitle: String? = null,
  public val payLaterAssetUrlsDescriptive: String? = null,
  public val payLaterAssetUrlsStandard: String? = null,
  public val payLaterName: String? = null,
  public val payLaterRedirectUrl: String? = null,
  public val payNowAssetUrlsDescriptive: String? = null,
  public val payNowAssetUrlsStandard: String? = null,
  public val payNowName: String? = null,
  public val payNowRedirectUrl: String? = null,
  public val payOverTimeAssetUrlsDescriptive: String? = null,
  public val payOverTimeAssetUrlsStandard: String? = null,
  public val payOverTimeName: String? = null,
  public val payOverTimeRedirectUrl: String? = null,
  public val paymentMethodCategories: String? = null,
  public val purchaseCountry: String? = null,
  public val purchaseType: String? = null,
  public val redirectUrl: String? = null,
  public val shippingDelay: Int? = null,
  public val shippingFirstName: String? = null,
  public val shippingLastName: String? = null,
) {
  public class Builder {
    public var backgroundImageUrl: String? = null

    public var clientToken: String? = null

    public var firstName: String? = null

    public var lastName: String? = null

    public var locale: String? = null

    public var logoUrl: String? = null

    public var pageTitle: String? = null

    public var payLaterAssetUrlsDescriptive: String? = null

    public var payLaterAssetUrlsStandard: String? = null

    public var payLaterName: String? = null

    public var payLaterRedirectUrl: String? = null

    public var payNowAssetUrlsDescriptive: String? = null

    public var payNowAssetUrlsStandard: String? = null

    public var payNowName: String? = null

    public var payNowRedirectUrl: String? = null

    public var payOverTimeAssetUrlsDescriptive: String? = null

    public var payOverTimeAssetUrlsStandard: String? = null

    public var payOverTimeName: String? = null

    public var payOverTimeRedirectUrl: String? = null

    public var paymentMethodCategories: String? = null

    public var purchaseCountry: String? = null

    public var purchaseType: String? = null

    public var redirectUrl: String? = null

    public var shippingDelay: Int? = null

    public var shippingFirstName: String? = null

    public var shippingLastName: String? = null

    public fun build(): SourceTypeKlarna = SourceTypeKlarna(
      backgroundImageUrl = backgroundImageUrl,
      clientToken = clientToken,
      firstName = firstName,
      lastName = lastName,
      locale = locale,
      logoUrl = logoUrl,
      pageTitle = pageTitle,
      payLaterAssetUrlsDescriptive = payLaterAssetUrlsDescriptive,
      payLaterAssetUrlsStandard = payLaterAssetUrlsStandard,
      payLaterName = payLaterName,
      payLaterRedirectUrl = payLaterRedirectUrl,
      payNowAssetUrlsDescriptive = payNowAssetUrlsDescriptive,
      payNowAssetUrlsStandard = payNowAssetUrlsStandard,
      payNowName = payNowName,
      payNowRedirectUrl = payNowRedirectUrl,
      payOverTimeAssetUrlsDescriptive = payOverTimeAssetUrlsDescriptive,
      payOverTimeAssetUrlsStandard = payOverTimeAssetUrlsStandard,
      payOverTimeName = payOverTimeName,
      payOverTimeRedirectUrl = payOverTimeRedirectUrl,
      paymentMethodCategories = paymentMethodCategories,
      purchaseCountry = purchaseCountry,
      purchaseType = purchaseType,
      redirectUrl = redirectUrl,
      shippingDelay = shippingDelay,
      shippingFirstName = shippingFirstName,
      shippingLastName = shippingLastName,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceTypeKlarna = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SourceTypeKlarna> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceTypeKlarna {
      val jsonDecoder = decoder.requireJsonDecoder("SourceTypeKlarna")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceTypeKlarna must be a JSON object")
      return SourceTypeKlarna(
        backgroundImageUrl = rawObject["background_image_url"]?.let { json.decodeFromJsonElement<String>(it) },
        clientToken = rawObject["client_token"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        firstName = rawObject["first_name"]?.let { json.decodeFromJsonElement<String>(it) },
        lastName = rawObject["last_name"]?.let { json.decodeFromJsonElement<String>(it) },
        locale = rawObject["locale"]?.let { json.decodeFromJsonElement<String>(it) },
        logoUrl = rawObject["logo_url"]?.let { json.decodeFromJsonElement<String>(it) },
        pageTitle = rawObject["page_title"]?.let { json.decodeFromJsonElement<String>(it) },
        payLaterAssetUrlsDescriptive = rawObject["pay_later_asset_urls_descriptive"]?.let { json.decodeFromJsonElement<String>(it) },
        payLaterAssetUrlsStandard = rawObject["pay_later_asset_urls_standard"]?.let { json.decodeFromJsonElement<String>(it) },
        payLaterName = rawObject["pay_later_name"]?.let { json.decodeFromJsonElement<String>(it) },
        payLaterRedirectUrl = rawObject["pay_later_redirect_url"]?.let { json.decodeFromJsonElement<String>(it) },
        payNowAssetUrlsDescriptive = rawObject["pay_now_asset_urls_descriptive"]?.let { json.decodeFromJsonElement<String>(it) },
        payNowAssetUrlsStandard = rawObject["pay_now_asset_urls_standard"]?.let { json.decodeFromJsonElement<String>(it) },
        payNowName = rawObject["pay_now_name"]?.let { json.decodeFromJsonElement<String>(it) },
        payNowRedirectUrl = rawObject["pay_now_redirect_url"]?.let { json.decodeFromJsonElement<String>(it) },
        payOverTimeAssetUrlsDescriptive = rawObject["pay_over_time_asset_urls_descriptive"]?.let { json.decodeFromJsonElement<String>(it) },
        payOverTimeAssetUrlsStandard = rawObject["pay_over_time_asset_urls_standard"]?.let { json.decodeFromJsonElement<String>(it) },
        payOverTimeName = rawObject["pay_over_time_name"]?.let { json.decodeFromJsonElement<String>(it) },
        payOverTimeRedirectUrl = rawObject["pay_over_time_redirect_url"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentMethodCategories = rawObject["payment_method_categories"]?.let { json.decodeFromJsonElement<String>(it) },
        purchaseCountry = rawObject["purchase_country"]?.let { json.decodeFromJsonElement<String>(it) },
        purchaseType = rawObject["purchase_type"]?.let { json.decodeFromJsonElement<String>(it) },
        redirectUrl = rawObject["redirect_url"]?.let { json.decodeFromJsonElement<String>(it) },
        shippingDelay = rawObject["shipping_delay"]?.let { json.decodeFromJsonElement<Int>(it) },
        shippingFirstName = rawObject["shipping_first_name"]?.let { json.decodeFromJsonElement<String>(it) },
        shippingLastName = rawObject["shipping_last_name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceTypeKlarna) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceTypeKlarna")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.backgroundImageUrl?.let { put("background_image_url", it) }
        value.clientToken?.let { put("client_token", it) }
        value.firstName?.let { put("first_name", it) }
        value.lastName?.let { put("last_name", it) }
        value.locale?.let { put("locale", it) }
        value.logoUrl?.let { put("logo_url", it) }
        value.pageTitle?.let { put("page_title", it) }
        value.payLaterAssetUrlsDescriptive?.let { put("pay_later_asset_urls_descriptive", it) }
        value.payLaterAssetUrlsStandard?.let { put("pay_later_asset_urls_standard", it) }
        value.payLaterName?.let { put("pay_later_name", it) }
        value.payLaterRedirectUrl?.let { put("pay_later_redirect_url", it) }
        value.payNowAssetUrlsDescriptive?.let { put("pay_now_asset_urls_descriptive", it) }
        value.payNowAssetUrlsStandard?.let { put("pay_now_asset_urls_standard", it) }
        value.payNowName?.let { put("pay_now_name", it) }
        value.payNowRedirectUrl?.let { put("pay_now_redirect_url", it) }
        value.payOverTimeAssetUrlsDescriptive?.let { put("pay_over_time_asset_urls_descriptive", it) }
        value.payOverTimeAssetUrlsStandard?.let { put("pay_over_time_asset_urls_standard", it) }
        value.payOverTimeName?.let { put("pay_over_time_name", it) }
        value.payOverTimeRedirectUrl?.let { put("pay_over_time_redirect_url", it) }
        value.paymentMethodCategories?.let { put("payment_method_categories", it) }
        value.purchaseCountry?.let { put("purchase_country", it) }
        value.purchaseType?.let { put("purchase_type", it) }
        value.redirectUrl?.let { put("redirect_url", it) }
        value.shippingDelay?.let { put("shipping_delay", json.encodeToJsonElement(it)) }
        value.shippingFirstName?.let { put("shipping_first_name", it) }
        value.shippingLastName?.let { put("shipping_last_name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceTypeKlarna(block: SourceTypeKlarna.Builder.() -> Unit): SourceTypeKlarna = SourceTypeKlarna.build(block)

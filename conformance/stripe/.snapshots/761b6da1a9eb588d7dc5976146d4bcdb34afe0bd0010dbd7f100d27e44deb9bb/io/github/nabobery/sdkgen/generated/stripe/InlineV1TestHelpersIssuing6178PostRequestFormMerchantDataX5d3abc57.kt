package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Details about the seller (grocery store, e-commerce website, etc.) where the card authorization happened.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_force_capture/post/requestBody/
 * content/application~1x-www-form-urlencoded/schema/properties/merchant_data
 */
@Serializable(with = InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataX5d3abc57.Serializer::class)
public class InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataX5d3abc57(
  public val category:
      InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataCategoryX9c92121a? = null,
  public val city: String? = null,
  public val country: String? = null,
  public val name: String? = null,
  public val networkId: String? = null,
  public val postalCode: String? = null,
  public val state: String? = null,
  public val terminalId: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    public var category: InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataCategoryX9c92121a?
        = null

    public var city: String? = null

    public var country: String? = null

    public var name: String? = null

    public var networkId: String? = null

    public var postalCode: String? = null

    public var state: String? = null

    public var terminalId: String? = null

    public var url: String? = null

    public fun build(): InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataX5d3abc57 = InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataX5d3abc57(
      category = category,
      city = city,
      country = country,
      name = name,
      networkId = networkId,
      postalCode = postalCode,
      state = state,
      terminalId = terminalId,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataX5d3abc57 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataX5d3abc57> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataX5d3abc57 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataX5d3abc57")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataX5d3abc57 must be a JSON object")
      return InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataX5d3abc57(
        category = rawObject["category"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataCategoryX9c92121a>(it) },
        city = rawObject["city"]?.let { json.decodeFromJsonElement<String>(it) },
        country = rawObject["country"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        networkId = rawObject["network_id"]?.let { json.decodeFromJsonElement<String>(it) },
        postalCode = rawObject["postal_code"]?.let { json.decodeFromJsonElement<String>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<String>(it) },
        terminalId = rawObject["terminal_id"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataX5d3abc57) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataX5d3abc57")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.category?.let { put("category", json.encodeToJsonElement(it)) }
        value.city?.let { put("city", it) }
        value.country?.let { put("country", it) }
        value.name?.let { put("name", it) }
        value.networkId?.let { put("network_id", it) }
        value.postalCode?.let { put("postal_code", it) }
        value.state?.let { put("state", it) }
        value.terminalId?.let { put("terminal_id", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuing6178PostRequestFormMerchantDataX5d3abc57(block: InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataX5d3abc57.Builder.() -> Unit): InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataX5d3abc57 = InlineV1TestHelpersIssuing6178PostRequestFormMerchantDataX5d3abc57.build(block)

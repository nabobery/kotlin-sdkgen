package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/automatic_tax/properties/liability.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/automatic_tax/properties/liability
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityX67e1e8bf.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityX67e1e8bf(
  public val type: InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityTypeXb2fad998,
  public val account: String? = null,
) {
  public class Builder {
    private var typeValue:
        InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityTypeXb2fad998? = null

    public var type: InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityTypeXb2fad998
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var account: String? = null

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityX67e1e8bf {
      check(typeValue != null) { "type is required" }
      return InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityX67e1e8bf(
        type = type,
        account = account,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityX67e1e8bf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityX67e1e8bf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityX67e1e8bf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityX67e1e8bf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityX67e1e8bf must be a JSON object")
      val type = json.decodeRequired<InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityTypeXb2fad998>(rawObject, "type")
      return InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityX67e1e8bf(
        type = type,
        account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityX67e1e8bf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityX67e1e8bf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.account?.let { put("account", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityX67e1e8bf(block: InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityX67e1e8bf.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityX67e1e8bf = InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityX67e1e8bf.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityX67e1e8bf is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

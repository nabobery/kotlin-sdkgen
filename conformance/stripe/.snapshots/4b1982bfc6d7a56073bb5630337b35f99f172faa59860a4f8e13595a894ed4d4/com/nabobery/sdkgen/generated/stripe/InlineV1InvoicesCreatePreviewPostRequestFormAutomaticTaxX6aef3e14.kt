package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * Settings for automatic tax lookup for this invoice preview.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/automatic_tax
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxX6aef3e14.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxX6aef3e14(
  public val enabled: Boolean,
  public val liability:
      InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityX67e1e8bf? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var liability:
        InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityX67e1e8bf? = null

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxX6aef3e14 {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxX6aef3e14(
        enabled = enabled,
        liability = liability,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxX6aef3e14 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxX6aef3e14> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxX6aef3e14 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxX6aef3e14")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxX6aef3e14 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxX6aef3e14(
        enabled = enabled,
        liability = rawObject["liability"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxLiabilityX67e1e8bf>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxX6aef3e14) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxX6aef3e14")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.liability?.let { put("liability", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxX6aef3e14(block: InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxX6aef3e14.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxX6aef3e14 = InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxX6aef3e14.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxX6aef3e14 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/items/items/properties/billing_thresh
 * olds/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/items/items/properties/billing_thresh
 * olds/anyOf/0
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17(
  public val usageGte: Int,
) {
  public class Builder {
    private var usageGteValue: Int? = null

    public var usageGte: Int
      get() = requireNotNull(usageGteValue) { "usageGte is required" }
      set(`value`) {
        usageGteValue = value
      }

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17 {
      check(usageGteValue != null) { "usageGte is required" }
      return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17(
        usageGte = usageGte,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17 must be a JSON object")
      val usageGte = json.decodeRequired<Int>(rawObject, "usage_gte")
      return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17(
        usageGte = usageGte,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("usage_gte", json.encodeToJsonElement(value.usageGte))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17(block: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17 = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

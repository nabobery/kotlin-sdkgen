package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1personalization_designs~1{personalization_design}~1r
 * eject/post/requestBody/content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1personalization_designs~1{personalization_design}~1r
 * eject/post/requestBody/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6.Serializer::class)
public class InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6(
  /**
   * The reason(s) the personalization design was rejected.
   */
  public val rejectionReasons:
      InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsX09132784,
  expand: List<String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var rejectionReasonsValue:
        InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsX09132784? = null

    public var rejectionReasons:
        InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsX09132784
      get() = requireNotNull(rejectionReasonsValue) { "rejectionReasons is required" }
      set(`value`) {
        rejectionReasonsValue = value
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6 {
      check(rejectionReasonsValue != null) { "rejectionReasons is required" }
      return InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6(
        rejectionReasons = rejectionReasons,
        expand = expand,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6 must be a JSON object")
      val rejectionReasons = json.decodeRequired<InlineV1TestHelpersIssuing78bcPostRequestFormRejectionReasonsX09132784>(rawObject, "rejection_reasons")
      return InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6(
        rejectionReasons = rejectionReasons,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("rejection_reasons", json.encodeToJsonElement(value.rejectionReasons))
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6(block: InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6.Builder.() -> Unit): InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6 = InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

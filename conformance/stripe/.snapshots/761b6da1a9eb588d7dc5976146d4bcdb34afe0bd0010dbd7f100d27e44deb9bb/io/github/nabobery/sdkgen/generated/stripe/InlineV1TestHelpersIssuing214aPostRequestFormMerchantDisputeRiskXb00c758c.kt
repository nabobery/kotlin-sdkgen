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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/risk_assessment/properties/merchant_dispute_risk.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/risk_assessment/properties/merchant_dispute_risk
 */
@Serializable(with = InlineV1TestHelpersIssuing214aPostRequestFormMerchantDisputeRiskXb00c758c.Serializer::class)
public class InlineV1TestHelpersIssuing214aPostRequestFormMerchantDisputeRiskXb00c758c(
  public val level: InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX9b108321,
  public val disputeRate: Int? = null,
) {
  public class Builder {
    private var levelValue:
        InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX9b108321? = null

    public var level: InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX9b108321
      get() = requireNotNull(levelValue) { "level is required" }
      set(`value`) {
        levelValue = value
      }

    public var disputeRate: Int? = null

    public fun build(): InlineV1TestHelpersIssuing214aPostRequestFormMerchantDisputeRiskXb00c758c {
      check(levelValue != null) { "level is required" }
      return InlineV1TestHelpersIssuing214aPostRequestFormMerchantDisputeRiskXb00c758c(
        level = level,
        disputeRate = disputeRate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing214aPostRequestFormMerchantDisputeRiskXb00c758c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing214aPostRequestFormMerchantDisputeRiskXb00c758c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing214aPostRequestFormMerchantDisputeRiskXb00c758c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing214aPostRequestFormMerchantDisputeRiskXb00c758c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing214aPostRequestFormMerchantDisputeRiskXb00c758c must be a JSON object")
      val level = json.decodeRequired<InlineV1TestHelpersIssuing214aPostRequestFormRiskAssessmentLevelX9b108321>(rawObject, "level")
      return InlineV1TestHelpersIssuing214aPostRequestFormMerchantDisputeRiskXb00c758c(
        level = level,
        disputeRate = rawObject["dispute_rate"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing214aPostRequestFormMerchantDisputeRiskXb00c758c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing214aPostRequestFormMerchantDisputeRiskXb00c758c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("level", json.encodeToJsonElement(value.level))
        value.disputeRate?.let { put("dispute_rate", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuing214aPostRequestFormMerchantDisputeRiskXb00c758c(block: InlineV1TestHelpersIssuing214aPostRequestFormMerchantDisputeRiskXb00c758c.Builder.() -> Unit): InlineV1TestHelpersIssuing214aPostRequestFormMerchantDisputeRiskXb00c758c = InlineV1TestHelpersIssuing214aPostRequestFormMerchantDisputeRiskXb00c758c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersIssuing214aPostRequestFormMerchantDisputeRiskXb00c758c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

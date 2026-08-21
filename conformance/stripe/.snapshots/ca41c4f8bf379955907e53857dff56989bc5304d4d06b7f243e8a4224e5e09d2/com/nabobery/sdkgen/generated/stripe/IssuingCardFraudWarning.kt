package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class IssuingCardFraudWarningView(
  @SerialName("started_at")
  public val startedAt: Int? = null,
  public val type: InlineIssuingCardFraudWarningTypeX2c1248f0? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_fraud_warning
 */
@Serializable(with = IssuingCardFraudWarning.Serializer::class)
public class IssuingCardFraudWarning(
  /**
   * Timestamp of the most recent fraud warning.
   */
  public val startedAt: Int? = null,
  /**
   * The type of fraud warning that most recently took place on this card. This field updates with every new fraud
   * warning, so the value changes over time. If populated, cancel and reissue the card.
   */
  public val type: InlineIssuingCardFraudWarningTypeX2c1248f0? = null,
) {
  public class Builder {
    /**
     * Timestamp of the most recent fraud warning.
     */
    public var startedAt: Int? = null

    /**
     * The type of fraud warning that most recently took place on this card. This field updates with every new fraud
     * warning, so the value changes over time. If populated, cancel and reissue the card.
     */
    public var type: InlineIssuingCardFraudWarningTypeX2c1248f0? = null

    public fun build(): IssuingCardFraudWarning = IssuingCardFraudWarning(
      startedAt = startedAt,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingCardFraudWarning = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingCardFraudWarning> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingCardFraudWarning {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingCardFraudWarning")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingCardFraudWarning must be a JSON object")
      return IssuingCardFraudWarning(
        startedAt = rawObject["started_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        type = rawObject["type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingCardFraudWarningTypeX2c1248f0?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingCardFraudWarning) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingCardFraudWarning")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.startedAt?.let { put("started_at", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingCardFraudWarning(block: IssuingCardFraudWarning.Builder.() -> Unit): IssuingCardFraudWarning = IssuingCardFraudWarning.build(block)

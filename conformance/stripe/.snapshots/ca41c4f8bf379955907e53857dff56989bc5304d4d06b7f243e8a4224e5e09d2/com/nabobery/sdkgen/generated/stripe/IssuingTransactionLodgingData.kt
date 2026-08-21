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
public data class IssuingTransactionLodgingDataView(
  @SerialName("check_in_at")
  public val checkInAt: Int? = null,
  public val nights: Int? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_transaction_lodging_data
 */
@Serializable(with = IssuingTransactionLodgingData.Serializer::class)
public class IssuingTransactionLodgingData(
  /**
   * The time of checking into the lodging.
   */
  public val checkInAt: Int? = null,
  /**
   * The number of nights stayed at the lodging.
   */
  public val nights: Int? = null,
) {
  public class Builder {
    /**
     * The time of checking into the lodging.
     */
    public var checkInAt: Int? = null

    /**
     * The number of nights stayed at the lodging.
     */
    public var nights: Int? = null

    public fun build(): IssuingTransactionLodgingData = IssuingTransactionLodgingData(
      checkInAt = checkInAt,
      nights = nights,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingTransactionLodgingData = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingTransactionLodgingData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingTransactionLodgingData {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingTransactionLodgingData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingTransactionLodgingData must be a JSON object")
      return IssuingTransactionLodgingData(
        checkInAt = rawObject["check_in_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        nights = rawObject["nights"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingTransactionLodgingData) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingTransactionLodgingData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.checkInAt?.let { put("check_in_at", json.encodeToJsonElement(it)) }
        value.nights?.let { put("nights", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingTransactionLodgingData(block: IssuingTransactionLodgingData.Builder.() -> Unit): IssuingTransactionLodgingData = IssuingTransactionLodgingData.build(block)

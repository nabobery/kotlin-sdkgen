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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_unlinked_refund/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/cardholde
 * r_prompt_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_unlinked_refund/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/purchase_details/properties/fleet/properties/cardholde
 * r_prompt_data
 */
@Serializable(with = InlineV1TestHelpersIssuingc1dfPostRequestFormCardholderPromptDataXca021f1b.Serializer::class)
public class InlineV1TestHelpersIssuingc1dfPostRequestFormCardholderPromptDataXca021f1b(
  public val driverId: String? = null,
  public val odometer: Int? = null,
  public val unspecifiedId: String? = null,
  public val userId: String? = null,
  public val vehicleNumber: String? = null,
) {
  public class Builder {
    public var driverId: String? = null

    public var odometer: Int? = null

    public var unspecifiedId: String? = null

    public var userId: String? = null

    public var vehicleNumber: String? = null

    public fun build(): InlineV1TestHelpersIssuingc1dfPostRequestFormCardholderPromptDataXca021f1b = InlineV1TestHelpersIssuingc1dfPostRequestFormCardholderPromptDataXca021f1b(
      driverId = driverId,
      odometer = odometer,
      unspecifiedId = unspecifiedId,
      userId = userId,
      vehicleNumber = vehicleNumber,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuingc1dfPostRequestFormCardholderPromptDataXca021f1b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuingc1dfPostRequestFormCardholderPromptDataXca021f1b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingc1dfPostRequestFormCardholderPromptDataXca021f1b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuingc1dfPostRequestFormCardholderPromptDataXca021f1b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuingc1dfPostRequestFormCardholderPromptDataXca021f1b must be a JSON object")
      return InlineV1TestHelpersIssuingc1dfPostRequestFormCardholderPromptDataXca021f1b(
        driverId = rawObject["driver_id"]?.let { json.decodeFromJsonElement<String>(it) },
        odometer = rawObject["odometer"]?.let { json.decodeFromJsonElement<Int>(it) },
        unspecifiedId = rawObject["unspecified_id"]?.let { json.decodeFromJsonElement<String>(it) },
        userId = rawObject["user_id"]?.let { json.decodeFromJsonElement<String>(it) },
        vehicleNumber = rawObject["vehicle_number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingc1dfPostRequestFormCardholderPromptDataXca021f1b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuingc1dfPostRequestFormCardholderPromptDataXca021f1b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.driverId?.let { put("driver_id", it) }
        value.odometer?.let { put("odometer", json.encodeToJsonElement(it)) }
        value.unspecifiedId?.let { put("unspecified_id", it) }
        value.userId?.let { put("user_id", it) }
        value.vehicleNumber?.let { put("vehicle_number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuingc1dfPostRequestFormCardholderPromptDataXca021f1b(block: InlineV1TestHelpersIssuingc1dfPostRequestFormCardholderPromptDataXca021f1b.Builder.() -> Unit): InlineV1TestHelpersIssuingc1dfPostRequestFormCardholderPromptDataXca021f1b = InlineV1TestHelpersIssuingc1dfPostRequestFormCardholderPromptDataXca021f1b.build(block)

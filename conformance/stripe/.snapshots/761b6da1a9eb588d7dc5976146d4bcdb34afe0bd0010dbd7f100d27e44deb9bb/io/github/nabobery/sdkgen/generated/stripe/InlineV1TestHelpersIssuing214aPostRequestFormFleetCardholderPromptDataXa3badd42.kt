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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/fleet/properties/cardholder_prompt_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/fleet/properties/cardholder_prompt_data
 */
@Serializable(with = InlineV1TestHelpersIssuing214aPostRequestFormFleetCardholderPromptDataXa3badd42.Serializer::class)
public class InlineV1TestHelpersIssuing214aPostRequestFormFleetCardholderPromptDataXa3badd42(
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

    public fun build(): InlineV1TestHelpersIssuing214aPostRequestFormFleetCardholderPromptDataXa3badd42 = InlineV1TestHelpersIssuing214aPostRequestFormFleetCardholderPromptDataXa3badd42(
      driverId = driverId,
      odometer = odometer,
      unspecifiedId = unspecifiedId,
      userId = userId,
      vehicleNumber = vehicleNumber,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing214aPostRequestFormFleetCardholderPromptDataXa3badd42 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing214aPostRequestFormFleetCardholderPromptDataXa3badd42> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing214aPostRequestFormFleetCardholderPromptDataXa3badd42 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing214aPostRequestFormFleetCardholderPromptDataXa3badd42")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing214aPostRequestFormFleetCardholderPromptDataXa3badd42 must be a JSON object")
      return InlineV1TestHelpersIssuing214aPostRequestFormFleetCardholderPromptDataXa3badd42(
        driverId = rawObject["driver_id"]?.let { json.decodeFromJsonElement<String>(it) },
        odometer = rawObject["odometer"]?.let { json.decodeFromJsonElement<Int>(it) },
        unspecifiedId = rawObject["unspecified_id"]?.let { json.decodeFromJsonElement<String>(it) },
        userId = rawObject["user_id"]?.let { json.decodeFromJsonElement<String>(it) },
        vehicleNumber = rawObject["vehicle_number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing214aPostRequestFormFleetCardholderPromptDataXa3badd42) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing214aPostRequestFormFleetCardholderPromptDataXa3badd42")
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

public fun inlineV1TestHelpersIssuing214aPostRequestFormFleetCardholderPromptDataXa3badd42(block: InlineV1TestHelpersIssuing214aPostRequestFormFleetCardholderPromptDataXa3badd42.Builder.() -> Unit): InlineV1TestHelpersIssuing214aPostRequestFormFleetCardholderPromptDataXa3badd42 = InlineV1TestHelpersIssuing214aPostRequestFormFleetCardholderPromptDataXa3badd42.build(block)

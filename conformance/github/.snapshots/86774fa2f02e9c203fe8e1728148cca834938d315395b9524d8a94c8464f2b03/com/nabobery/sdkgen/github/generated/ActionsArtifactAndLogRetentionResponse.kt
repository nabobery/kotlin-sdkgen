package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/actions-artifact-and-log-retention-response.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-artifact-and-log-retention-response
 */
@Serializable(with = ActionsArtifactAndLogRetentionResponse.Serializer::class)
public class ActionsArtifactAndLogRetentionResponse(
  /**
   * The number of days artifacts and logs are retained
   */
  public val days: Int,
  /**
   * The maximum number of days that can be configured
   */
  public val maximumAllowedDays: Int,
) {
  public class Builder {
    private var daysValue: Int? = null

    public var days: Int
      get() = requireNotNull(daysValue) { "days is required" }
      set(`value`) {
        daysValue = value
      }

    private var maximumAllowedDaysValue: Int? = null

    public var maximumAllowedDays: Int
      get() = requireNotNull(maximumAllowedDaysValue) { "maximumAllowedDays is required" }
      set(`value`) {
        maximumAllowedDaysValue = value
      }

    public fun build(): ActionsArtifactAndLogRetentionResponse {
      check(daysValue != null) { "days is required" }
      check(maximumAllowedDaysValue != null) { "maximumAllowedDays is required" }
      return ActionsArtifactAndLogRetentionResponse(
        days = days,
        maximumAllowedDays = maximumAllowedDays,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsArtifactAndLogRetentionResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ActionsArtifactAndLogRetentionResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsArtifactAndLogRetentionResponse {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsArtifactAndLogRetentionResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsArtifactAndLogRetentionResponse must be a JSON object")
      val days = json.decodeRequired<Int>(rawObject, "days")
      val maximumAllowedDays = json.decodeRequired<Int>(rawObject, "maximum_allowed_days")
      return ActionsArtifactAndLogRetentionResponse(
        days = days,
        maximumAllowedDays = maximumAllowedDays,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsArtifactAndLogRetentionResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsArtifactAndLogRetentionResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("days", json.encodeToJsonElement(value.days))
        put("maximum_allowed_days", json.encodeToJsonElement(value.maximumAllowedDays))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsArtifactAndLogRetentionResponse(block: ActionsArtifactAndLogRetentionResponse.Builder.() -> Unit): ActionsArtifactAndLogRetentionResponse = ActionsArtifactAndLogRetentionResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ActionsArtifactAndLogRetentionResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

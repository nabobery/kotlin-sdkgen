package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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

internal data class SchemaInteger(
  public val negative: Boolean,
  public val digits: String,
)

internal data class SchemaDecimal(
  public val negative: Boolean,
  public val digits: String,
  public val scale: SchemaInteger,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/actions-artifact-and-log-retention.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-artifact-and-log-retention
 */
@Serializable(with = ActionsArtifactAndLogRetention.Serializer::class)
public class ActionsArtifactAndLogRetention(
  /**
   * The number of days to retain artifacts and logs
   */
  public val days: Int,
) {
  public class Builder {
    private var daysValue: Int? = null

    public var days: Int
      get() = requireNotNull(daysValue) { "days is required" }
      set(`value`) {
        daysValue = value
      }

    public fun build(): ActionsArtifactAndLogRetention {
      check(daysValue != null) { "days is required" }
      return ActionsArtifactAndLogRetention(
        days = days,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsArtifactAndLogRetention = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ActionsArtifactAndLogRetention> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsArtifactAndLogRetention {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsArtifactAndLogRetention")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsArtifactAndLogRetention must be a JSON object")
      val days = json.decodeRequired<Int>(rawObject, "days")
      return ActionsArtifactAndLogRetention(
        days = days,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsArtifactAndLogRetention) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsArtifactAndLogRetention")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("days", json.encodeToJsonElement(value.days))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsArtifactAndLogRetention(block: ActionsArtifactAndLogRetention.Builder.() -> Unit): ActionsArtifactAndLogRetention = ActionsArtifactAndLogRetention.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ActionsArtifactAndLogRetention is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

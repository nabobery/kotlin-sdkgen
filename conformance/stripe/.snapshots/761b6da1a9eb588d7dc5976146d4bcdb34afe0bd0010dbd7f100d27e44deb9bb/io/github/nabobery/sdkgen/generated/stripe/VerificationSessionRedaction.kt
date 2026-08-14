package io.github.nabobery.sdkgen.generated.stripe

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

@Serializable
public data class VerificationSessionRedactionView(
  public val status: InlineVerificationSessionRedactionStatusX160933ce,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/verification_session_redaction
 */
@Serializable(with = VerificationSessionRedaction.Serializer::class)
public class VerificationSessionRedaction(
  /**
   * Indicates whether this object and its related objects have been redacted or not.
   */
  public val status: InlineVerificationSessionRedactionStatusX160933ce,
) {
  public class Builder {
    private var statusValue: InlineVerificationSessionRedactionStatusX160933ce? = null

    public var status: InlineVerificationSessionRedactionStatusX160933ce
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    public fun build(): VerificationSessionRedaction {
      check(statusValue != null) { "status is required" }
      return VerificationSessionRedaction(
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): VerificationSessionRedaction = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<VerificationSessionRedaction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): VerificationSessionRedaction {
      val jsonDecoder = decoder.requireJsonDecoder("VerificationSessionRedaction")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("VerificationSessionRedaction must be a JSON object")
      val status = json.decodeRequired<InlineVerificationSessionRedactionStatusX160933ce>(rawObject, "status")
      return VerificationSessionRedaction(
        status = status,
      )
    }

    override fun serialize(encoder: Encoder, `value`: VerificationSessionRedaction) {
      val jsonEncoder = encoder.requireJsonEncoder("VerificationSessionRedaction")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun verificationSessionRedaction(block: VerificationSessionRedaction.Builder.() -> Unit): VerificationSessionRedaction = VerificationSessionRedaction.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("VerificationSessionRedaction is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

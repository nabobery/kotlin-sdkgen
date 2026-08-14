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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_code_verification_flow
 */
@Serializable(with = SourceCodeVerificationFlow.Serializer::class)
public class SourceCodeVerificationFlow(
  /**
   * The number of attempts remaining to authenticate the source object with a verification code.
   */
  public val attemptsRemaining: Int,
  /**
   * The status of the code verification, either `pending` (awaiting verification, `attempts_remaining` should be
   * greater than 0), `succeeded` (successful verification) or `failed` (failed verification, cannot be verified anymore
   * as `attempts_remaining` should be 0).
   */
  public val status: String,
) {
  public class Builder {
    private var attemptsRemainingValue: Int? = null

    public var attemptsRemaining: Int
      get() = requireNotNull(attemptsRemainingValue) { "attemptsRemaining is required" }
      set(`value`) {
        attemptsRemainingValue = value
      }

    private var statusValue: String? = null

    public var status: String
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    public fun build(): SourceCodeVerificationFlow {
      check(attemptsRemainingValue != null) { "attemptsRemaining is required" }
      check(statusValue != null) { "status is required" }
      return SourceCodeVerificationFlow(
        attemptsRemaining = attemptsRemaining,
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceCodeVerificationFlow = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SourceCodeVerificationFlow> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceCodeVerificationFlow {
      val jsonDecoder = decoder.requireJsonDecoder("SourceCodeVerificationFlow")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceCodeVerificationFlow must be a JSON object")
      val attemptsRemaining = json.decodeRequired<Int>(rawObject, "attempts_remaining")
      val status = json.decodeRequired<String>(rawObject, "status")
      return SourceCodeVerificationFlow(
        attemptsRemaining = attemptsRemaining,
        status = status,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceCodeVerificationFlow) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceCodeVerificationFlow")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("attempts_remaining", json.encodeToJsonElement(value.attemptsRemaining))
        put("status", value.status)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceCodeVerificationFlow(block: SourceCodeVerificationFlow.Builder.() -> Unit): SourceCodeVerificationFlow = SourceCodeVerificationFlow.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SourceCodeVerificationFlow is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

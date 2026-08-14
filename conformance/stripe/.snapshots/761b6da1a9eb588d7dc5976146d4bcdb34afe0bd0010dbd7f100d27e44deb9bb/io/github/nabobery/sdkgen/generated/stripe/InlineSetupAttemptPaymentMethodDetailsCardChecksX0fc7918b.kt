package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918bBranch {
  SetupAttemptPaymentMethodDetailsCardChecks,
}

public sealed class InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918bNoMatchException(
  message: String,
) : InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918bDecodingException(message)

internal data class InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918bInspection(
  public val matchesSetupAttemptPaymentMethodDetailsCardChecks: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSetupAttemptPaymentMethodDetailsCardChecks).count { it }
}

/**
 * Check results by Card networks on Card address and CVC at the time of authorization
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_attempt_payment_method_details_card/properties/checks
 */
@Serializable(with = InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918b.Serializer::class)
public class InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918bInspection,
) {
  public val setupAttemptPaymentMethodDetailsCardChecks:
      SetupAttemptPaymentMethodDetailsCardChecksView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupAttemptPaymentMethodDetailsCardChecks) json.decodeFromJsonElement<SetupAttemptPaymentMethodDetailsCardChecksView>(raw) else null }

  public val matchedBranches: Set<InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918bBranch>
    get() = buildSet {
      if (inspection.matchesSetupAttemptPaymentMethodDetailsCardChecks) add(InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918bBranch.SetupAttemptPaymentMethodDetailsCardChecks)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918b {
      val inspection = inspectInlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918b(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918bNoMatchException("InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918b) {
      encoder.requireJsonEncoder("InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918b(element: JsonElement): InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918bInspection {
  val raw = element as? JsonObject ?: return InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918bInspection(
    matchesSetupAttemptPaymentMethodDetailsCardChecks = false,
    failures = listOf("SetupAttemptPaymentMethodDetailsCardChecks: expected JSON object"),
  )
  val matchesSetupAttemptPaymentMethodDetailsCardChecks = true
  return InlineSetupAttemptPaymentMethodDetailsCardChecksX0fc7918bInspection(
    matchesSetupAttemptPaymentMethodDetailsCardChecks = matchesSetupAttemptPaymentMethodDetailsCardChecks,
    failures = buildList {
      if (!matchesSetupAttemptPaymentMethodDetailsCardChecks) add("SetupAttemptPaymentMethodDetailsCardChecks: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

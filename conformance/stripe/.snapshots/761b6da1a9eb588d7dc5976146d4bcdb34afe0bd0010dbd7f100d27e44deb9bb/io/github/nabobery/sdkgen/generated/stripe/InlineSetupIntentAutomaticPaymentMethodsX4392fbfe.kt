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

public enum class InlineSetupIntentAutomaticPaymentMethodsX4392fbfeBranch {
  PaymentFlowsAutomaticPaymentMethodsSetupIntent,
}

public sealed class InlineSetupIntentAutomaticPaymentMethodsX4392fbfeDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupIntentAutomaticPaymentMethodsX4392fbfeNoMatchException(
  message: String,
) : InlineSetupIntentAutomaticPaymentMethodsX4392fbfeDecodingException(message)

internal data class InlineSetupIntentAutomaticPaymentMethodsX4392fbfeInspection(
  public val matchesPaymentFlowsAutomaticPaymentMethodsSetupIntent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentFlowsAutomaticPaymentMethodsSetupIntent).count { it }
}

/**
 * Settings for dynamic payment methods compatible with this Setup Intent
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent/properties/automatic_payment_methods
 */
@Serializable(with = InlineSetupIntentAutomaticPaymentMethodsX4392fbfe.Serializer::class)
public class InlineSetupIntentAutomaticPaymentMethodsX4392fbfe internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupIntentAutomaticPaymentMethodsX4392fbfeInspection,
) {
  public val paymentFlowsAutomaticPaymentMethodsSetupIntent:
      PaymentFlowsAutomaticPaymentMethodsSetupIntentView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentFlowsAutomaticPaymentMethodsSetupIntent) json.decodeFromJsonElement<PaymentFlowsAutomaticPaymentMethodsSetupIntentView>(raw) else null }

  public val matchedBranches: Set<InlineSetupIntentAutomaticPaymentMethodsX4392fbfeBranch>
    get() = buildSet {
      if (inspection.matchesPaymentFlowsAutomaticPaymentMethodsSetupIntent) add(InlineSetupIntentAutomaticPaymentMethodsX4392fbfeBranch.PaymentFlowsAutomaticPaymentMethodsSetupIntent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupIntentAutomaticPaymentMethodsX4392fbfe {
      val inspection = inspectInlineSetupIntentAutomaticPaymentMethodsX4392fbfe(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupIntentAutomaticPaymentMethodsX4392fbfeNoMatchException("InlineSetupIntentAutomaticPaymentMethodsX4392fbfe matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupIntentAutomaticPaymentMethodsX4392fbfe(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentAutomaticPaymentMethodsX4392fbfe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupIntentAutomaticPaymentMethodsX4392fbfe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentAutomaticPaymentMethodsX4392fbfe")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentAutomaticPaymentMethodsX4392fbfe) {
      encoder.requireJsonEncoder("InlineSetupIntentAutomaticPaymentMethodsX4392fbfe").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupIntentAutomaticPaymentMethodsX4392fbfe(element: JsonElement): InlineSetupIntentAutomaticPaymentMethodsX4392fbfeInspection {
  val raw = element as? JsonObject ?: return InlineSetupIntentAutomaticPaymentMethodsX4392fbfeInspection(
    matchesPaymentFlowsAutomaticPaymentMethodsSetupIntent = false,
    failures = listOf("PaymentFlowsAutomaticPaymentMethodsSetupIntent: expected JSON object"),
  )
  val matchesPaymentFlowsAutomaticPaymentMethodsSetupIntent = true
  return InlineSetupIntentAutomaticPaymentMethodsX4392fbfeInspection(
    matchesPaymentFlowsAutomaticPaymentMethodsSetupIntent = matchesPaymentFlowsAutomaticPaymentMethodsSetupIntent,
    failures = buildList {
      if (!matchesPaymentFlowsAutomaticPaymentMethodsSetupIntent) add("PaymentFlowsAutomaticPaymentMethodsSetupIntent: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

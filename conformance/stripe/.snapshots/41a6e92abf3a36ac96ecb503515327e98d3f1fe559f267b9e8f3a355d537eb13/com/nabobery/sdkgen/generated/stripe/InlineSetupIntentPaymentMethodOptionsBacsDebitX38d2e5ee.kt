package com.nabobery.sdkgen.generated.stripe

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

public enum class InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5eeBranch {
  SetupIntentPaymentMethodOptionsBacsDebit,
  SetupIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5eeDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5eeNoMatchException(
  message: String,
) : InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5eeDecodingException(message)

internal data class InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5eeInspection(
  public val matchesSetupIntentPaymentMethodOptionsBacsDebit: Boolean,
  public val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSetupIntentPaymentMethodOptionsBacsDebit, matchesSetupIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/bacs_debit.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/bacs_debit
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5ee.Serializer::class)
public class InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5ee internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5eeInspection,
) {
  public val setupIntentPaymentMethodOptionsBacsDebit: SetupIntentPaymentMethodOptionsBacsDebitView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntentPaymentMethodOptionsBacsDebit) json.decodeFromJsonElement<SetupIntentPaymentMethodOptionsBacsDebitView>(raw) else null }

  public val setupIntentTypeSpecificPaymentMethodOptionsClient:
      SetupIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<SetupIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5eeBranch>
    get() = buildSet {
      if (inspection.matchesSetupIntentPaymentMethodOptionsBacsDebit) add(InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5eeBranch.SetupIntentPaymentMethodOptionsBacsDebit)
      if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) add(InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5eeBranch.SetupIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5ee {
      val inspection = inspectInlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5ee(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5eeNoMatchException("InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5ee matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5ee(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5ee> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5ee {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5ee")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5ee) {
      encoder.requireJsonEncoder("InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5ee").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5ee(element: JsonElement): InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5eeInspection {
  val raw = element as? JsonObject ?: return InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5eeInspection(
    matchesSetupIntentPaymentMethodOptionsBacsDebit = false,
    matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("SetupIntentPaymentMethodOptionsBacsDebit: expected JSON object", "SetupIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesSetupIntentPaymentMethodOptionsBacsDebit = true
  val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlineSetupIntentPaymentMethodOptionsBacsDebitX38d2e5eeInspection(
    matchesSetupIntentPaymentMethodOptionsBacsDebit = matchesSetupIntentPaymentMethodOptionsBacsDebit,
    matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = matchesSetupIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesSetupIntentPaymentMethodOptionsBacsDebit) add("SetupIntentPaymentMethodOptionsBacsDebit: required properties  do not match their declared types")
      if (!matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) add("SetupIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

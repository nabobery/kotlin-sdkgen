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

public enum class InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554Branch {
  SetupIntentPaymentMethodOptionsUsBankAccount,
  SetupIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554NoMatchException(
  message: String,
) : InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554DecodingException(message)

internal data class InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554Inspection(
  public val matchesSetupIntentPaymentMethodOptionsUsBankAccount: Boolean,
  public val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSetupIntentPaymentMethodOptionsUsBankAccount, matchesSetupIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/us_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/us_bank_account
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554.Serializer::class)
public class InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554Inspection,
) {
  public val setupIntentPaymentMethodOptionsUsBankAccount:
      SetupIntentPaymentMethodOptionsUsBankAccountView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntentPaymentMethodOptionsUsBankAccount) json.decodeFromJsonElement<SetupIntentPaymentMethodOptionsUsBankAccountView>(raw) else null }

  public val setupIntentTypeSpecificPaymentMethodOptionsClient:
      SetupIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<SetupIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554Branch>
    get() = buildSet {
      if (inspection.matchesSetupIntentPaymentMethodOptionsUsBankAccount) add(InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554Branch.SetupIntentPaymentMethodOptionsUsBankAccount)
      if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) add(InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554Branch.SetupIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554 {
      val inspection = inspectInlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554NoMatchException("InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554) {
      encoder.requireJsonEncoder("InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554(element: JsonElement): InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554Inspection {
  val raw = element as? JsonObject ?: return InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554Inspection(
    matchesSetupIntentPaymentMethodOptionsUsBankAccount = false,
    matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("SetupIntentPaymentMethodOptionsUsBankAccount: expected JSON object", "SetupIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesSetupIntentPaymentMethodOptionsUsBankAccount = true
  val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlineSetupIntentPaymentMethodOptionsUsBankAccountXf393a554Inspection(
    matchesSetupIntentPaymentMethodOptionsUsBankAccount = matchesSetupIntentPaymentMethodOptionsUsBankAccount,
    matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = matchesSetupIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesSetupIntentPaymentMethodOptionsUsBankAccount) add("SetupIntentPaymentMethodOptionsUsBankAccount: required properties  do not match their declared types")
      if (!matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) add("SetupIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

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

public enum class InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401aBranch {
  SetupIntentPaymentMethodOptionsCardMandateOptions,
}

public sealed class InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401aNoMatchException(
  message: String,
) : InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401aDecodingException(message)

internal data class InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401aInspection(
  public val matchesSetupIntentPaymentMethodOptionsCardMandateOptions: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesSetupIntentPaymentMethodOptionsCardMandateOptions).count { it }
}

/**
 * Configuration options for setting up an eMandate for cards issued in India.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_card/properties/mandate_options
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401a.Serializer::class)
public class InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401aInspection,
) {
  public val setupIntentPaymentMethodOptionsCardMandateOptions:
      SetupIntentPaymentMethodOptionsCardMandateOptionsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntentPaymentMethodOptionsCardMandateOptions) json.decodeFromJsonElement<SetupIntentPaymentMethodOptionsCardMandateOptionsView>(raw) else null }

  public val matchedBranches:
      Set<InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401aBranch>
    get() = buildSet {
      if (inspection.matchesSetupIntentPaymentMethodOptionsCardMandateOptions) add(InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401aBranch.SetupIntentPaymentMethodOptionsCardMandateOptions)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401a {
      val inspection = inspectInlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401a(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401aNoMatchException("InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401a) {
      encoder.requireJsonEncoder("InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401a(element: JsonElement): InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401aInspection {
  val raw = element as? JsonObject ?: return InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401aInspection(
    matchesSetupIntentPaymentMethodOptionsCardMandateOptions = false,
    failures = listOf("SetupIntentPaymentMethodOptionsCardMandateOptions: expected JSON object"),
  )
  val matchesSetupIntentPaymentMethodOptionsCardMandateOptions = raw["amount"] != null && raw["amount_type"] != null && raw["currency"].isString() && raw["interval"] != null && raw["reference"].isString() && raw["start_date"] != null
  return InlineSetupIntentPaymentMethodOptionsCardMandateOptionsX641d401aInspection(
    matchesSetupIntentPaymentMethodOptionsCardMandateOptions = matchesSetupIntentPaymentMethodOptionsCardMandateOptions,
    failures = buildList {
      if (!matchesSetupIntentPaymentMethodOptionsCardMandateOptions) add("SetupIntentPaymentMethodOptionsCardMandateOptions: required properties 'amount', 'amount_type', 'currency', 'interval', 'reference', 'start_date' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

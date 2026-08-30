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

@Serializable
public class InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bcBranch1View()

public enum class InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bcBranch {
  Branch1,
  SetupIntentTypeSpecificPaymentMethodOptionsClient,
}

public sealed class InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bcDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bcNoMatchException(
  message: String,
) : InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bcDecodingException(message)

internal data class InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bcInspection(
  public val matchesBranch1: Boolean,
  public val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesSetupIntentTypeSpecificPaymentMethodOptionsClient).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/amazon_pay.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options/properties/amazon_pay
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bc.Serializer::class)
public class InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bcInspection,
) {
  public val branch1: InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bcBranch1View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bcBranch1View>(raw) else null }

  public val setupIntentTypeSpecificPaymentMethodOptionsClient:
      SetupIntentTypeSpecificPaymentMethodOptionsClientView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) json.decodeFromJsonElement<SetupIntentTypeSpecificPaymentMethodOptionsClientView>(raw) else null }

  public val matchedBranches: Set<InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bcBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bcBranch.Branch1)
      if (inspection.matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) add(InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bcBranch.SetupIntentTypeSpecificPaymentMethodOptionsClient)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bc {
      val inspection = inspectInlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bc(raw)
      if (inspection.matchCount == 0) {
        throw InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bcNoMatchException("InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bc(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bc) {
      encoder.requireJsonEncoder("InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bc(element: JsonElement): InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bcInspection {
  val raw = element as? JsonObject ?: return InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bcInspection(
    matchesBranch1 = false,
    matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = false,
    failures = listOf("Branch1: expected JSON object", "SetupIntentTypeSpecificPaymentMethodOptionsClient: expected JSON object"),
  )
  val matchesBranch1 = true
  val matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = true
  return InlineSetupIntentPaymentMethodOptionsAmazonPayXa8ec01bcInspection(
    matchesBranch1 = matchesBranch1,
    matchesSetupIntentTypeSpecificPaymentMethodOptionsClient = matchesSetupIntentTypeSpecificPaymentMethodOptionsClient,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: required properties  do not match their declared types")
      if (!matchesSetupIntentTypeSpecificPaymentMethodOptionsClient) add("SetupIntentTypeSpecificPaymentMethodOptionsClient: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

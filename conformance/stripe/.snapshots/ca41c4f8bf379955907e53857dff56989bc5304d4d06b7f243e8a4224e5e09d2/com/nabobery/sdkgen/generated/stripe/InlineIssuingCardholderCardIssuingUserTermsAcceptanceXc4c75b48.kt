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

public enum class InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48Branch {
  IssuingCardholderUserTermsAcceptance,
}

public sealed class InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48NoMatchException(
  message: String,
) : InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48DecodingException(message)

internal data class InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48Inspection(
  public val matchesIssuingCardholderUserTermsAcceptance: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingCardholderUserTermsAcceptance).count { it }
}

/**
 * Information about cardholder acceptance of Celtic [Authorized User
 * Terms](https://stripe.com/docs/issuing/cards#accept-authorized-user-terms). Required for cards backed by a Celtic
 * program.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_card_issuing/properties/user_terms_acceptance
 */
@Serializable(with = InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48.Serializer::class)
public class InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48Inspection,
) {
  public val issuingCardholderUserTermsAcceptance: IssuingCardholderUserTermsAcceptanceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingCardholderUserTermsAcceptance) json.decodeFromJsonElement<IssuingCardholderUserTermsAcceptanceView>(raw) else null }

  public val matchedBranches:
      Set<InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48Branch>
    get() = buildSet {
      if (inspection.matchesIssuingCardholderUserTermsAcceptance) add(InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48Branch.IssuingCardholderUserTermsAcceptance)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48 {
      val inspection = inspectInlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48NoMatchException("InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48) {
      encoder.requireJsonEncoder("InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48(element: JsonElement): InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48Inspection(
    matchesIssuingCardholderUserTermsAcceptance = false,
    failures = listOf("IssuingCardholderUserTermsAcceptance: expected JSON object"),
  )
  val matchesIssuingCardholderUserTermsAcceptance = true
  return InlineIssuingCardholderCardIssuingUserTermsAcceptanceXc4c75b48Inspection(
    matchesIssuingCardholderUserTermsAcceptance = matchesIssuingCardholderUserTermsAcceptance,
    failures = buildList {
      if (!matchesIssuingCardholderUserTermsAcceptance) add("IssuingCardholderUserTermsAcceptance: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

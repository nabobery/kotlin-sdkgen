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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994Branch {
  Branch1,
  InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2Xa4a3c7ce,
}

public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994NoMatchException(
  message: String,
) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994DecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2Xa4a3c7ce:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2Xa4a3c7ce).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/bacs_debit/properties/mandate_options/properties/reference_prefix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/bacs_debit/properties/mandate_options/properties/reference_prefix
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2Xa4a3c7ce:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2Xa4a3c7ce? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2Xa4a3c7ce) json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2Xa4a3c7ce>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994Branch.Branch1)
      if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2Xa4a3c7ce) add(InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994Branch.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2Xa4a3c7ce)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994 {
      val inspection = inspectInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994NoMatchException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994(element: JsonElement): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2Xa4a3c7ce = element.isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2Xa4a3c7ce>()
  return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsReferencePrefixX68f26994Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2Xa4a3c7ce = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2Xa4a3c7ce,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2Xa4a3c7ce) add("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2Xa4a3c7ce: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitAnyOf2Xa4a3c7ce")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

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

public enum class InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393cBranch {
  Branch1,
  InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X7dfa0a53,
}

public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393cNoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393cDecodingException(message)

internal data class InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393cInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X7dfa0a53:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X7dfa0a53).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/default_mandate.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/payment_settings/properties/default_mandate
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393c.Serializer::class)
public class InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393cInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X7dfa0a53:
      InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X7dfa0a53? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X7dfa0a53) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X7dfa0a53>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393cBranch.Branch1)
      if (inspection.matchesInlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X7dfa0a53) add(InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393cBranch.InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X7dfa0a53)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393c {
      val inspection = inspectInlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393cNoMatchException("InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393c) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393c(element: JsonElement): InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393cInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X7dfa0a53 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X7dfa0a53>()
  return InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateX3595393cInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X7dfa0a53 = matchesInlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X7dfa0a53,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X7dfa0a53) add("InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X7dfa0a53: value does not match InlineV1InvoicesPostRequestFormPaymentSettingsDefaultMandateAnyOf2X7dfa0a53")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

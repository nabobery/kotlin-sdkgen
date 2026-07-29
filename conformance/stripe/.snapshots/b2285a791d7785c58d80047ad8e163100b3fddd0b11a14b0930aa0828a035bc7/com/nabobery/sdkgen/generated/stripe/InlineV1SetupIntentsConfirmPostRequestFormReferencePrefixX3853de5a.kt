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

public enum class InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5aBranch {
  Branch1,
  InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X040f2285,
}

public sealed class InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5aNoMatchException(
  message: String,
) : InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5aDecodingException(message)

internal data class InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5aInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X040f2285:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X040f2285).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/bacs_debit/properties/mandate_options/propertie
 * s/reference_prefix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/bacs_debit/properties/mandate_options/propertie
 * s/reference_prefix
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5a.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X040f2285:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X040f2285? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X040f2285) json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X040f2285>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5aBranch.Branch1)
      if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X040f2285) add(InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5aBranch.InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X040f2285)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5a {
      val inspection = inspectInlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5aNoMatchException("InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5a(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5a) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5a(element: JsonElement): InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X040f2285 = element.isJsonDecodable<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X040f2285>()
  return InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3853de5aInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X040f2285 = matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X040f2285,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X040f2285) add("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X040f2285: value does not match InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X040f2285")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

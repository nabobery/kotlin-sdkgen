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

public enum class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608dbBranch {
  Branch1,
  InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X1af5323f,
}

public sealed class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608dbDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608dbNoMatchException(
  message: String,
) : InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608dbDecodingException(message)

internal data class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608dbInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X1af5323f:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X1af5323f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/phone.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/phone
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608db.Serializer::class)
public class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608db internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608dbInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X1af5323f:
      InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X1af5323f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X1af5323f) json.decodeFromJsonElement<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X1af5323f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608dbBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608dbBranch.Branch1)
      if (inspection.matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X1af5323f) add(InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608dbBranch.InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X1af5323f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608db {
      val inspection = inspectInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608db(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608dbNoMatchException("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608db matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608db(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608db> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608db {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608db")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608db) {
      encoder.requireJsonEncoder("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608db").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608db(element: JsonElement): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608dbInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X1af5323f = element.isJsonDecodable<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X1af5323f>()
  return InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608dbInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X1af5323f = matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X1af5323f,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X1af5323f) add("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X1af5323f: value does not match InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAnyOf2X1af5323f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

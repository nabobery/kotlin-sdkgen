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

public enum class InlineConfirmationTokensRe6486OnlineXa9b18f1eBranch {
  ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline,
}

public sealed class InlineConfirmationTokensRe6486OnlineXa9b18f1eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineConfirmationTokensRe6486OnlineXa9b18f1eNoMatchException(
  message: String,
) : InlineConfirmationTokensRe6486OnlineXa9b18f1eDecodingException(message)

internal data class InlineConfirmationTokensRe6486OnlineXa9b18f1eInspection(
  public val matchesConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline).count { it }
}

/**
 * If this is a Mandate accepted online, this hash contains details about the online acceptance.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/confirmation_tokens_resource_mandate_data_resource_customer_acceptan
 * ce/properties/online
 */
@Serializable(with = InlineConfirmationTokensRe6486OnlineXa9b18f1e.Serializer::class)
public class InlineConfirmationTokensRe6486OnlineXa9b18f1e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineConfirmationTokensRe6486OnlineXa9b18f1eInspection,
) {
  public val confirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline:
      ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnlineView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline) json.decodeFromJsonElement<ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnlineView>(raw) else null }

  public val matchedBranches: Set<InlineConfirmationTokensRe6486OnlineXa9b18f1eBranch>
    get() = buildSet {
      if (inspection.matchesConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline) add(InlineConfirmationTokensRe6486OnlineXa9b18f1eBranch.ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineConfirmationTokensRe6486OnlineXa9b18f1e {
      val inspection = inspectInlineConfirmationTokensRe6486OnlineXa9b18f1e(raw)
      if (inspection.matchCount == 0) {
        throw InlineConfirmationTokensRe6486OnlineXa9b18f1eNoMatchException("InlineConfirmationTokensRe6486OnlineXa9b18f1e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineConfirmationTokensRe6486OnlineXa9b18f1e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineConfirmationTokensRe6486OnlineXa9b18f1e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineConfirmationTokensRe6486OnlineXa9b18f1e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineConfirmationTokensRe6486OnlineXa9b18f1e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineConfirmationTokensRe6486OnlineXa9b18f1e) {
      encoder.requireJsonEncoder("InlineConfirmationTokensRe6486OnlineXa9b18f1e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineConfirmationTokensRe6486OnlineXa9b18f1e(element: JsonElement): InlineConfirmationTokensRe6486OnlineXa9b18f1eInspection {
  val raw = element as? JsonObject ?: return InlineConfirmationTokensRe6486OnlineXa9b18f1eInspection(
    matchesConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline = false,
    failures = listOf("ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline: expected JSON object"),
  )
  val matchesConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline = true
  return InlineConfirmationTokensRe6486OnlineXa9b18f1eInspection(
    matchesConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline = matchesConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline,
    failures = buildList {
      if (!matchesConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline) add("ConfirmationTokensResourceMandateDataResourceCustomerAcceptanceResourceOnline: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

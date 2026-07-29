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

public enum class InlineKlarnaPayerDetailsAddressXf6d978beBranch {
  KlarnaAddress,
}

public sealed class InlineKlarnaPayerDetailsAddressXf6d978beDecodingException(
  message: String,
) : SerializationException(message)

public class InlineKlarnaPayerDetailsAddressXf6d978beNoMatchException(
  message: String,
) : InlineKlarnaPayerDetailsAddressXf6d978beDecodingException(message)

internal data class InlineKlarnaPayerDetailsAddressXf6d978beInspection(
  public val matchesKlarnaAddress: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesKlarnaAddress).count { it }
}

/**
 * The payer's address
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/klarna_payer_details/properties/address
 */
@Serializable(with = InlineKlarnaPayerDetailsAddressXf6d978be.Serializer::class)
public class InlineKlarnaPayerDetailsAddressXf6d978be internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineKlarnaPayerDetailsAddressXf6d978beInspection,
) {
  public val klarnaAddress: KlarnaAddressView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesKlarnaAddress) json.decodeFromJsonElement<KlarnaAddressView>(raw) else null }

  public val matchedBranches: Set<InlineKlarnaPayerDetailsAddressXf6d978beBranch>
    get() = buildSet {
      if (inspection.matchesKlarnaAddress) add(InlineKlarnaPayerDetailsAddressXf6d978beBranch.KlarnaAddress)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineKlarnaPayerDetailsAddressXf6d978be {
      val inspection = inspectInlineKlarnaPayerDetailsAddressXf6d978be(raw)
      if (inspection.matchCount == 0) {
        throw InlineKlarnaPayerDetailsAddressXf6d978beNoMatchException("InlineKlarnaPayerDetailsAddressXf6d978be matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineKlarnaPayerDetailsAddressXf6d978be(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineKlarnaPayerDetailsAddressXf6d978be> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineKlarnaPayerDetailsAddressXf6d978be {
      val jsonDecoder = decoder.requireJsonDecoder("InlineKlarnaPayerDetailsAddressXf6d978be")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineKlarnaPayerDetailsAddressXf6d978be) {
      encoder.requireJsonEncoder("InlineKlarnaPayerDetailsAddressXf6d978be").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineKlarnaPayerDetailsAddressXf6d978be(element: JsonElement): InlineKlarnaPayerDetailsAddressXf6d978beInspection {
  val raw = element as? JsonObject ?: return InlineKlarnaPayerDetailsAddressXf6d978beInspection(
    matchesKlarnaAddress = false,
    failures = listOf("KlarnaAddress: expected JSON object"),
  )
  val matchesKlarnaAddress = true
  return InlineKlarnaPayerDetailsAddressXf6d978beInspection(
    matchesKlarnaAddress = matchesKlarnaAddress,
    failures = buildList {
      if (!matchesKlarnaAddress) add("KlarnaAddress: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }

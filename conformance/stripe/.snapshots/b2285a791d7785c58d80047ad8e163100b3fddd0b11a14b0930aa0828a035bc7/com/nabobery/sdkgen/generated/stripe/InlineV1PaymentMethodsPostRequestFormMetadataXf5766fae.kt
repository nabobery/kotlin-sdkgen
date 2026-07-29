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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PaymentMethodsPostRequestFormMetadataXf5766faeBranch {
  Branch1,
  InlineV1PaymentMethodsPostRequestFormMetadataAnyOf2Xbdc8a83c,
}

public sealed class InlineV1PaymentMethodsPostRequestFormMetadataXf5766faeDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentMethodsPostRequestFormMetadataXf5766faeNoMatchException(
  message: String,
) : InlineV1PaymentMethodsPostRequestFormMetadataXf5766faeDecodingException(message)

internal data class InlineV1PaymentMethodsPostRequestFormMetadataXf5766faeInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentMethodsPostRequestFormMetadataAnyOf2Xbdc8a83c: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentMethodsPostRequestFormMetadataAnyOf2Xbdc8a83c).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormMetadataXf5766fae.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormMetadataXf5766fae internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentMethodsPostRequestFormMetadataXf5766faeInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1PaymentMethodsPostRequestFormMetadataAnyOf2Xbdc8a83c:
      InlineV1PaymentMethodsPostRequestFormMetadataAnyOf2Xbdc8a83c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentMethodsPostRequestFormMetadataAnyOf2Xbdc8a83c) json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormMetadataAnyOf2Xbdc8a83c>(raw) else null }

  public val matchedBranches: Set<InlineV1PaymentMethodsPostRequestFormMetadataXf5766faeBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentMethodsPostRequestFormMetadataXf5766faeBranch.Branch1)
      if (inspection.matchesInlineV1PaymentMethodsPostRequestFormMetadataAnyOf2Xbdc8a83c) add(InlineV1PaymentMethodsPostRequestFormMetadataXf5766faeBranch.InlineV1PaymentMethodsPostRequestFormMetadataAnyOf2Xbdc8a83c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentMethodsPostRequestFormMetadataXf5766fae {
      val inspection = inspectInlineV1PaymentMethodsPostRequestFormMetadataXf5766fae(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentMethodsPostRequestFormMetadataXf5766faeNoMatchException("InlineV1PaymentMethodsPostRequestFormMetadataXf5766fae matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentMethodsPostRequestFormMetadataXf5766fae(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormMetadataXf5766fae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormMetadataXf5766fae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormMetadataXf5766fae")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormMetadataXf5766fae) {
      encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormMetadataXf5766fae").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentMethodsPostRequestFormMetadataXf5766fae(element: JsonElement): InlineV1PaymentMethodsPostRequestFormMetadataXf5766faeInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1PaymentMethodsPostRequestFormMetadataAnyOf2Xbdc8a83c = element.isJsonDecodable<InlineV1PaymentMethodsPostRequestFormMetadataAnyOf2Xbdc8a83c>()
  return InlineV1PaymentMethodsPostRequestFormMetadataXf5766faeInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentMethodsPostRequestFormMetadataAnyOf2Xbdc8a83c = matchesInlineV1PaymentMethodsPostRequestFormMetadataAnyOf2Xbdc8a83c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1PaymentMethodsPostRequestFormMetadataAnyOf2Xbdc8a83c) add("InlineV1PaymentMethodsPostRequestFormMetadataAnyOf2Xbdc8a83c: value does not match InlineV1PaymentMethodsPostRequestFormMetadataAnyOf2Xbdc8a83c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

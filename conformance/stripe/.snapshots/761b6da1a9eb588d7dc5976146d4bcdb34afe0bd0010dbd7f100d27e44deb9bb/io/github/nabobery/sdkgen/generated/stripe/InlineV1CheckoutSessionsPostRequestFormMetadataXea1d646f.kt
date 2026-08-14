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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646fBranch {
  Branch1,
  InlineV1CheckoutSessionsPostRequestFormMetadataAnyOf2X99f48c69,
}

public sealed class InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646fNoMatchException(
  message: String,
) : InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646fDecodingException(message)

internal data class InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CheckoutSessionsPostRequestFormMetadataAnyOf2X99f48c69: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CheckoutSessionsPostRequestFormMetadataAnyOf2X99f48c69).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646f.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646fInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1CheckoutSessionsPostRequestFormMetadataAnyOf2X99f48c69:
      InlineV1CheckoutSessionsPostRequestFormMetadataAnyOf2X99f48c69? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormMetadataAnyOf2X99f48c69) json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormMetadataAnyOf2X99f48c69>(raw) else null }

  public val matchedBranches: Set<InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646fBranch.Branch1)
      if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormMetadataAnyOf2X99f48c69) add(InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646fBranch.InlineV1CheckoutSessionsPostRequestFormMetadataAnyOf2X99f48c69)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646f {
      val inspection = inspectInlineV1CheckoutSessionsPostRequestFormMetadataXea1d646f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646fNoMatchException("InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646f) {
      encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CheckoutSessionsPostRequestFormMetadataXea1d646f(element: JsonElement): InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646fInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1CheckoutSessionsPostRequestFormMetadataAnyOf2X99f48c69 = element.isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormMetadataAnyOf2X99f48c69>()
  return InlineV1CheckoutSessionsPostRequestFormMetadataXea1d646fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CheckoutSessionsPostRequestFormMetadataAnyOf2X99f48c69 = matchesInlineV1CheckoutSessionsPostRequestFormMetadataAnyOf2X99f48c69,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1CheckoutSessionsPostRequestFormMetadataAnyOf2X99f48c69) add("InlineV1CheckoutSessionsPostRequestFormMetadataAnyOf2X99f48c69: value does not match InlineV1CheckoutSessionsPostRequestFormMetadataAnyOf2X99f48c69")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

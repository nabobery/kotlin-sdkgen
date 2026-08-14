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

public enum class InlineV1AccountsPersonsPostRequestFormMetadataX57922428Branch {
  Branch1,
  InlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X942c1d6c,
}

public sealed class InlineV1AccountsPersonsPostRequestFormMetadataX57922428DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPersonsPostRequestFormMetadataX57922428NoMatchException(
  message: String,
) : InlineV1AccountsPersonsPostRequestFormMetadataX57922428DecodingException(message)

internal data class InlineV1AccountsPersonsPostRequestFormMetadataX57922428Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X942c1d6c: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X942c1d6c).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormMetadataX57922428.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormMetadataX57922428 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1AccountsPersonsPostRequestFormMetadataX57922428Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X942c1d6c:
      InlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X942c1d6c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X942c1d6c) json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X942c1d6c>(raw) else null }

  public val matchedBranches: Set<InlineV1AccountsPersonsPostRequestFormMetadataX57922428Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPersonsPostRequestFormMetadataX57922428Branch.Branch1)
      if (inspection.matchesInlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X942c1d6c) add(InlineV1AccountsPersonsPostRequestFormMetadataX57922428Branch.InlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X942c1d6c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPersonsPostRequestFormMetadataX57922428 {
      val inspection = inspectInlineV1AccountsPersonsPostRequestFormMetadataX57922428(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPersonsPostRequestFormMetadataX57922428NoMatchException("InlineV1AccountsPersonsPostRequestFormMetadataX57922428 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPersonsPostRequestFormMetadataX57922428(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormMetadataX57922428> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormMetadataX57922428 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormMetadataX57922428")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormMetadataX57922428) {
      encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormMetadataX57922428").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPersonsPostRequestFormMetadataX57922428(element: JsonElement): InlineV1AccountsPersonsPostRequestFormMetadataX57922428Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X942c1d6c = element.isJsonDecodable<InlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X942c1d6c>()
  return InlineV1AccountsPersonsPostRequestFormMetadataX57922428Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X942c1d6c = matchesInlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X942c1d6c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X942c1d6c) add("InlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X942c1d6c: value does not match InlineV1AccountsPersonsPostRequestFormMetadataAnyOf2X942c1d6c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

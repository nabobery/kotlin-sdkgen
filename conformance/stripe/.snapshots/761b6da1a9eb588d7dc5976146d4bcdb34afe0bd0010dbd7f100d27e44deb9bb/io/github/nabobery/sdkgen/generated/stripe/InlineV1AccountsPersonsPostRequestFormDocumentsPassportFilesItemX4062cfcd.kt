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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcdBranch {
  Branch1,
  InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2,
}

public sealed class InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcdDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcdNoMatchException(
  message: String,
) : InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcdDecodingException(message)

internal data class InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcdInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/documents/properties/passport/properties/files/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/documents/properties/passport/properties/files/items
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcd.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcdInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2:
      InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2) json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcdBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcdBranch.Branch1)
      if (inspection.matchesInlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2) add(InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcdBranch.InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcd {
      val inspection = inspectInlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcd(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcdNoMatchException("InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcd(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcd) {
      encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcd(element: JsonElement): InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcdInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2 = element.isJsonDecodable<InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2>()
  return InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemX4062cfcdInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2 = matchesInlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2) add("InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2: value does not match InlineV1AccountsPersonsPostRequestFormDocumentsPassportFilesItemAnyOf2X26bc14b2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

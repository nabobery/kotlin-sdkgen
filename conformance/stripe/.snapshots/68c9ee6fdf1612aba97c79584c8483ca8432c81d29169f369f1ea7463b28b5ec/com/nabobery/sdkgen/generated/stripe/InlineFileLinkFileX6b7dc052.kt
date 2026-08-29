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

public enum class InlineFileLinkFileX6b7dc052Branch {
  Branch1,
  File,
}

public sealed class InlineFileLinkFileX6b7dc052DecodingException(
  message: String,
) : SerializationException(message)

public class InlineFileLinkFileX6b7dc052NoMatchException(
  message: String,
) : InlineFileLinkFileX6b7dc052DecodingException(message)

internal data class InlineFileLinkFileX6b7dc052Inspection(
  public val matchesBranch1: Boolean,
  public val matchesFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * The file object this link points to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/file_link/properties/file
 */
@Serializable(with = InlineFileLinkFileX6b7dc052.Serializer::class)
public class InlineFileLinkFileX6b7dc052 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineFileLinkFileX6b7dc052Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches: Set<InlineFileLinkFileX6b7dc052Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineFileLinkFileX6b7dc052Branch.Branch1)
      if (inspection.matchesFile) add(InlineFileLinkFileX6b7dc052Branch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineFileLinkFileX6b7dc052 {
      val inspection = inspectInlineFileLinkFileX6b7dc052(raw)
      if (inspection.matchCount == 0) {
        throw InlineFileLinkFileX6b7dc052NoMatchException("InlineFileLinkFileX6b7dc052 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineFileLinkFileX6b7dc052(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineFileLinkFileX6b7dc052> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFileLinkFileX6b7dc052 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFileLinkFileX6b7dc052")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineFileLinkFileX6b7dc052) {
      encoder.requireJsonEncoder("InlineFileLinkFileX6b7dc052").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineFileLinkFileX6b7dc052(element: JsonElement): InlineFileLinkFileX6b7dc052Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineFileLinkFileX6b7dc052Inspection(
    matchesBranch1 = matchesBranch1,
    matchesFile = matchesFile,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesFile) add("File: value does not match File")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

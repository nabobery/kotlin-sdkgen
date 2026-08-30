package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Double
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

public enum class InlineIssueFieldValueValueX38411decBranch {
  Branch1,
  Branch2,
  Branch3,
}

public sealed class InlineIssueFieldValueValueX38411decDecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssueFieldValueValueX38411decNoMatchException(
  message: String,
) : InlineIssueFieldValueValueX38411decDecodingException(message)

internal data class InlineIssueFieldValueValueX38411decInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3).count { it }
}

/**
 * The value of the issue field
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-field-value/properties/value
 */
@Serializable(with = InlineIssueFieldValueValueX38411dec.Serializer::class)
public class InlineIssueFieldValueValueX38411dec internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssueFieldValueValueX38411decInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Double>(raw) else null }

  public val branch3: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineIssueFieldValueValueX38411decBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssueFieldValueValueX38411decBranch.Branch1)
      if (inspection.matchesBranch2) add(InlineIssueFieldValueValueX38411decBranch.Branch2)
      if (inspection.matchesBranch3) add(InlineIssueFieldValueValueX38411decBranch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssueFieldValueValueX38411dec {
      val inspection = inspectInlineIssueFieldValueValueX38411dec(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssueFieldValueValueX38411decNoMatchException("InlineIssueFieldValueValueX38411dec matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssueFieldValueValueX38411dec(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssueFieldValueValueX38411dec> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssueFieldValueValueX38411dec {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssueFieldValueValueX38411dec")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssueFieldValueValueX38411dec) {
      encoder.requireJsonEncoder("InlineIssueFieldValueValueX38411dec").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssueFieldValueValueX38411dec(element: JsonElement): InlineIssueFieldValueValueX38411decInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  val matchesBranch3 = element.isJsonDecodable<Int>()
  return InlineIssueFieldValueValueX38411decInspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match Double")
      if (!matchesBranch3) add("Branch3: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

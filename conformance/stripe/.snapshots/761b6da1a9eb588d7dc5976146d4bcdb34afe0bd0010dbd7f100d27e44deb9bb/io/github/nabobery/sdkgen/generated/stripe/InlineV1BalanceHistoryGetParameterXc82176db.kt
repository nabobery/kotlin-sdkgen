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

public enum class InlineV1BalanceHistoryGetParameterXc82176dbBranch {
  InlineV1BalanceHistoryGetParameterAnyOf1X0f8a4c0a,
  Branch2,
}

public sealed class InlineV1BalanceHistoryGetParameterXc82176dbDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1BalanceHistoryGetParameterXc82176dbNoMatchException(
  message: String,
) : InlineV1BalanceHistoryGetParameterXc82176dbDecodingException(message)

internal data class InlineV1BalanceHistoryGetParameterXc82176dbInspection(
  public val matchesInlineV1BalanceHistoryGetParameterAnyOf1X0f8a4c0a: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1BalanceHistoryGetParameterAnyOf1X0f8a4c0a, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1balance~1history/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1balance~1history/get/parameters/0/schema
 */
@Serializable(with = InlineV1BalanceHistoryGetParameterXc82176db.Serializer::class)
public class InlineV1BalanceHistoryGetParameterXc82176db internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1BalanceHistoryGetParameterXc82176dbInspection,
) {
  public val inlineV1BalanceHistoryGetParameterAnyOf1X0f8a4c0a:
      InlineV1BalanceHistoryGetParameterAnyOf1X0f8a4c0a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1BalanceHistoryGetParameterAnyOf1X0f8a4c0a) json.decodeFromJsonElement<InlineV1BalanceHistoryGetParameterAnyOf1X0f8a4c0a>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1BalanceHistoryGetParameterXc82176dbBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1BalanceHistoryGetParameterAnyOf1X0f8a4c0a) add(InlineV1BalanceHistoryGetParameterXc82176dbBranch.InlineV1BalanceHistoryGetParameterAnyOf1X0f8a4c0a)
      if (inspection.matchesBranch2) add(InlineV1BalanceHistoryGetParameterXc82176dbBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1BalanceHistoryGetParameterXc82176db {
      val inspection = inspectInlineV1BalanceHistoryGetParameterXc82176db(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1BalanceHistoryGetParameterXc82176dbNoMatchException("InlineV1BalanceHistoryGetParameterXc82176db matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1BalanceHistoryGetParameterXc82176db(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1BalanceHistoryGetParameterXc82176db> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BalanceHistoryGetParameterXc82176db {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BalanceHistoryGetParameterXc82176db")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BalanceHistoryGetParameterXc82176db) {
      encoder.requireJsonEncoder("InlineV1BalanceHistoryGetParameterXc82176db").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1BalanceHistoryGetParameterXc82176db(element: JsonElement): InlineV1BalanceHistoryGetParameterXc82176dbInspection {
  val matchesInlineV1BalanceHistoryGetParameterAnyOf1X0f8a4c0a = element.isJsonDecodable<InlineV1BalanceHistoryGetParameterAnyOf1X0f8a4c0a>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1BalanceHistoryGetParameterXc82176dbInspection(
    matchesInlineV1BalanceHistoryGetParameterAnyOf1X0f8a4c0a = matchesInlineV1BalanceHistoryGetParameterAnyOf1X0f8a4c0a,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1BalanceHistoryGetParameterAnyOf1X0f8a4c0a) add("InlineV1BalanceHistoryGetParameterAnyOf1X0f8a4c0a: value does not match InlineV1BalanceHistoryGetParameterAnyOf1X0f8a4c0a")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

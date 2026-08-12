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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76cBranch {
  Branch1,
  InlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X63c92824,
}

public sealed class InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76cNoMatchException(
  message: String,
) : InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76cDecodingException(message)

internal data class InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76cInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X63c92824: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X63c92824).count { it }
}

/**
 * A list of alternate names or aliases that the person is known by.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/full_name_aliases
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76c.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76cInspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X63c92824:
      InlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X63c92824? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X63c92824) json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X63c92824>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76cBranch.Branch1)
      if (inspection.matchesInlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X63c92824) add(InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76cBranch.InlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X63c92824)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76c {
      val inspection = inspectInlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76cNoMatchException("InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76c) {
      encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76c(element: JsonElement): InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76cInspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X63c92824 = element.isJsonDecodable<InlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X63c92824>()
  return InlineV1AccountsPersonsPostRequestFormFullNameAliasesXd6b9b76cInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X63c92824 = matchesInlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X63c92824,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X63c92824) add("InlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X63c92824: value does not match InlineV1AccountsPersonsPostRequestFormFullNameAliasesAnyOf2X63c92824")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

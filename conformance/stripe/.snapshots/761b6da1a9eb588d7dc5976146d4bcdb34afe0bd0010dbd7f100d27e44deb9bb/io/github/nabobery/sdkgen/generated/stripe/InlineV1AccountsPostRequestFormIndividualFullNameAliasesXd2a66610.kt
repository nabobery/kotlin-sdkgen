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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610Branch {
  Branch1,
  InlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2Xf12fe28e,
}

public sealed class InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610NoMatchException(
  message: String,
) : InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610DecodingException(message)

internal data class InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2Xf12fe28e:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2Xf12fe28e).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/individual/properties/full_name_aliases.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/individual/properties/full_name_aliases
 */
@Serializable(with = InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610.Serializer::class)
public class InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2Xf12fe28e:
      InlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2Xf12fe28e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2Xf12fe28e) json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2Xf12fe28e>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610Branch.Branch1)
      if (inspection.matchesInlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2Xf12fe28e) add(InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610Branch.InlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2Xf12fe28e)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610 {
      val inspection = inspectInlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610NoMatchException("InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610) {
      encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610(element: JsonElement): InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2Xf12fe28e = element.isJsonDecodable<InlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2Xf12fe28e>()
  return InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2Xf12fe28e = matchesInlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2Xf12fe28e,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2Xf12fe28e) add("InlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2Xf12fe28e: value does not match InlineV1AccountsPostRequestFormIndividualFullNameAliasesAnyOf2Xf12fe28e")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

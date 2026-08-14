package io.github.nabobery.sdkgen.github.generated

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

public enum class InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711Branch {
  Branch1,
  Branch2,
}

public sealed class InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711DecodingException(
  message: String,
) : SerializationException(message)

public class InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711NoMatchException(
  message: String,
) : InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711DecodingException(message)

internal data class InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1dependabot~1secrets~1{secret_name}/put/requestBody/content/applica
 * tion~1json/schema/properties/selected_repository_ids/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1dependabot~1secrets~1{secret_name}/put/requestBody/content/applica
 * tion~1json/schema/properties/selected_repository_ids/items
 */
@Serializable(with = InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711.Serializer::class)
public class InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches:
      Set<InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711 {
      val inspection = inspectInlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711(raw)
      if (inspection.matchCount == 0) {
        throw InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711NoMatchException("InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711) {
      encoder.requireJsonEncoder("InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711(element: JsonElement): InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineOrgsDependabotSecretsPutRequestJsonSelectedRepositoryIdsItemXd33f4711Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesBranch2) add("Branch2: value does not match String")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}

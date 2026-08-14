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

public enum class InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0eBranch {
  Branch1,
  Branch2,
}

public sealed class InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0eNoMatchException(
  message: String,
) : InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0eDecodingException(message)

internal data class InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0eInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces~1secrets~1{secret_name}/put/requestBody/content/application~1j
 * son/schema/properties/selected_repository_ids/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1codespaces~1secrets~1{secret_name}/put/requestBody/content/application~1j
 * son/schema/properties/selected_repository_ids/items
 */
@Serializable(with = InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0e.Serializer::class)
public class InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0eInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches:
      Set<InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0eBranch.Branch1)
      if (inspection.matchesBranch2) add(InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0eBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0e {
      val inspection = inspectInlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0e(raw)
      if (inspection.matchCount == 0) {
        throw InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0eNoMatchException("InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0e) {
      encoder.requireJsonEncoder("InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0e(element: JsonElement): InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0eInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineUserCodespacesSecretsPutRequestJsonSelectedRepositoryIdsItemX0a04ff0eInspection(
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

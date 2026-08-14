package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class InlineUsersProjectsV2ItemsPostRequestJsonX37722517DecodingException(
  message: String,
) : SerializationException(message)

public class InlineUsersProjectsV2ItemsPostRequestJsonX37722517NoMatchException(
  message: String,
) : InlineUsersProjectsV2ItemsPostRequestJsonX37722517DecodingException(message)

public class InlineUsersProjectsV2ItemsPostRequestJsonX37722517AmbiguityException(
  message: String,
) : InlineUsersProjectsV2ItemsPostRequestJsonX37722517DecodingException(message)

public class InlineUsersProjectsV2ItemsPostRequestJsonX37722517BranchValidationException(
  message: String,
) : InlineUsersProjectsV2ItemsPostRequestJsonX37722517DecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1projectsV2~1{project_number}~1items/post/requestBody/content
 * /application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1projectsV2~1{project_number}~1items/post/requestBody/content
 * /application~1json/schema
 */
@Serializable(with = InlineUsersProjectsV2ItemsPostRequestJsonX37722517Serializer::class)
public sealed interface InlineUsersProjectsV2ItemsPostRequestJsonX37722517 {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class _0 internal constructor(
    public val id: Int,
    public val type: InlineUsersProjectsV2ItemsPostRequestJsonTypeXe83f2da6,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineUsersProjectsV2ItemsPostRequestJsonX37722517 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: Int, type: InlineUsersProjectsV2ItemsPostRequestJsonTypeXe83f2da6): _0 {
        val raw = buildJsonObject {
          put("id", SdkJson.encodeToJsonElement(id))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineUsersProjectsV2ItemsPostRequestJsonX37722517(raw)
        if (inspection.size == 0) {
          throw InlineUsersProjectsV2ItemsPostRequestJsonX37722517NoMatchException("InlineUsersProjectsV2ItemsPostRequestJsonX37722517 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection._0Matches) {
          throw InlineUsersProjectsV2ItemsPostRequestJsonX37722517BranchValidationException("_0 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineUsersProjectsV2ItemsPostRequestJsonX37722517AmbiguityException("InlineUsersProjectsV2ItemsPostRequestJsonX37722517 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return _0(
          id = id,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class _1 internal constructor(
    public val number: Int,
    public val owner: String,
    public val repo: String,
    public val type: InlineUsersProjectsV2ItemsPostRequestJsonTypeXe83f2da6,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineUsersProjectsV2ItemsPostRequestJsonX37722517 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        number: Int,
        owner: String,
        repo: String,
        type: InlineUsersProjectsV2ItemsPostRequestJsonTypeXe83f2da6,
      ): _1 {
        val raw = buildJsonObject {
          put("number", SdkJson.encodeToJsonElement(number))
          put("owner", owner)
          put("repo", repo)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineUsersProjectsV2ItemsPostRequestJsonX37722517(raw)
        if (inspection.size == 0) {
          throw InlineUsersProjectsV2ItemsPostRequestJsonX37722517NoMatchException("InlineUsersProjectsV2ItemsPostRequestJsonX37722517 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection._1Matches) {
          throw InlineUsersProjectsV2ItemsPostRequestJsonX37722517BranchValidationException("_1 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineUsersProjectsV2ItemsPostRequestJsonX37722517AmbiguityException("InlineUsersProjectsV2ItemsPostRequestJsonX37722517 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return _1(
          number = number,
          owner = owner,
          repo = repo,
          type = type,
          raw = raw,
        )
      }
    }
  }
}

internal object InlineUsersProjectsV2ItemsPostRequestJsonX37722517Serializer : KSerializer<InlineUsersProjectsV2ItemsPostRequestJsonX37722517> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): InlineUsersProjectsV2ItemsPostRequestJsonX37722517 {
    val jsonDecoder = decoder.requireJsonDecoder("InlineUsersProjectsV2ItemsPostRequestJsonX37722517")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineUsersProjectsV2ItemsPostRequestJsonX37722517NoMatchException("InlineUsersProjectsV2ItemsPostRequestJsonX37722517 matched 0 branches: expected JSON object")
    val matches = inspectInlineUsersProjectsV2ItemsPostRequestJsonX37722517(rawObject)
    if (matches.size == 0) {
      throw InlineUsersProjectsV2ItemsPostRequestJsonX37722517NoMatchException("InlineUsersProjectsV2ItemsPostRequestJsonX37722517 matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw InlineUsersProjectsV2ItemsPostRequestJsonX37722517AmbiguityException("InlineUsersProjectsV2ItemsPostRequestJsonX37722517 matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches._0Matches -> InlineUsersProjectsV2ItemsPostRequestJsonX37722517._0(id = requireNotNull(matches.id), type = requireNotNull(matches.type), raw = rawObject)
      matches._1Matches -> InlineUsersProjectsV2ItemsPostRequestJsonX37722517._1(number = requireNotNull(matches.number), owner = requireNotNull(matches.owner), repo = requireNotNull(matches.repo), type = requireNotNull(matches.type), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: InlineUsersProjectsV2ItemsPostRequestJsonX37722517) {
    encoder.requireJsonEncoder("InlineUsersProjectsV2ItemsPostRequestJsonX37722517").encodeJsonElement(value.raw)
  }
}

internal data class InlineUsersProjectsV2ItemsPostRequestJsonX37722517Inspection(
  public val id: Int?,
  public val idDecoded: Boolean,
  public val type: InlineUsersProjectsV2ItemsPostRequestJsonTypeXe83f2da6?,
  public val typeDecoded: Boolean,
  public val typeMatches: Boolean,
  public val number: Int?,
  public val numberDecoded: Boolean,
  public val owner: String?,
  public val ownerDecoded: Boolean,
  public val repo: String?,
  public val repoDecoded: Boolean,
  public val _0Matches: Boolean,
  public val _1Matches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (_0Matches) add("_0")
      if (_1Matches) add("_1")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineUsersProjectsV2ItemsPostRequestJsonX37722517(rawObject: JsonObject): InlineUsersProjectsV2ItemsPostRequestJsonX37722517Inspection {
  val idResult = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val id = idResult?.getOrNull()
  val idDecoded = idResult?.isSuccess == true
  val typeResult = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineUsersProjectsV2ItemsPostRequestJsonTypeXe83f2da6>(element) } }
  val type = typeResult?.getOrNull()
  val typeDecoded = typeResult?.isSuccess == true
  val typeMatches = (rawObject.stringValue("type") == "Issue" || rawObject.stringValue("type") == "PullRequest") && typeDecoded
  val numberResult = rawObject["number"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val number = numberResult?.getOrNull()
  val numberDecoded = numberResult?.isSuccess == true
  val ownerResult = rawObject["owner"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val owner = ownerResult?.getOrNull()
  val ownerDecoded = ownerResult?.isSuccess == true
  val repoResult = rawObject["repo"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val repo = repoResult?.getOrNull()
  val repoDecoded = repoResult?.isSuccess == true
  val rawEmpty = rawObject.isEmpty()
  val _0Matches = idDecoded
  val _1Matches = numberDecoded && ownerDecoded && repoDecoded
  return InlineUsersProjectsV2ItemsPostRequestJsonX37722517Inspection(
    id = id,
    idDecoded = idDecoded,
    type = type,
    typeDecoded = typeDecoded,
    typeMatches = typeMatches,
    number = number,
    numberDecoded = numberDecoded,
    owner = owner,
    ownerDecoded = ownerDecoded,
    repo = repo,
    repoDecoded = repoDecoded,
    _0Matches = _0Matches,
    _1Matches = _1Matches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!_0Matches) add("_0: branch predicate did not match properties 'id'")
      if (!_1Matches) add("_1: branch predicate did not match properties 'number' and 'owner' and 'repo'")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}

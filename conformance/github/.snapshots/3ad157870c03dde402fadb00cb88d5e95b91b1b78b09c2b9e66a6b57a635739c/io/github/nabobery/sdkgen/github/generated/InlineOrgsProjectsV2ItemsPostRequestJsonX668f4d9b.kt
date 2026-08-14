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

public sealed class InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bNoMatchException(
  message: String,
) : InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bDecodingException(message)

public class InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bAmbiguityException(
  message: String,
) : InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bDecodingException(message)

public class InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bBranchValidationException(
  message: String,
) : InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bDecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1items/post/requestBody/content/appli
 * cation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1items/post/requestBody/content/appli
 * cation~1json/schema
 */
@Serializable(with = InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bSerializer::class)
public sealed interface InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class _0 internal constructor(
    public val id: Int,
    public val type: InlineOrgsProjectsV2ItemsPostRequestJsonTypeX83a33ad6,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: Int, type: InlineOrgsProjectsV2ItemsPostRequestJsonTypeX83a33ad6): _0 {
        val raw = buildJsonObject {
          put("id", SdkJson.encodeToJsonElement(id))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b(raw)
        if (inspection.size == 0) {
          throw InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bNoMatchException("InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection._0Matches) {
          throw InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bBranchValidationException("_0 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bAmbiguityException("InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
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
    public val type: InlineOrgsProjectsV2ItemsPostRequestJsonTypeX83a33ad6,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        number: Int,
        owner: String,
        repo: String,
        type: InlineOrgsProjectsV2ItemsPostRequestJsonTypeX83a33ad6,
      ): _1 {
        val raw = buildJsonObject {
          put("number", SdkJson.encodeToJsonElement(number))
          put("owner", owner)
          put("repo", repo)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b(raw)
        if (inspection.size == 0) {
          throw InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bNoMatchException("InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection._1Matches) {
          throw InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bBranchValidationException("_1 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bAmbiguityException("InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
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

internal object InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bSerializer : KSerializer<InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b {
    val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bNoMatchException("InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b matched 0 branches: expected JSON object")
    val matches = inspectInlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b(rawObject)
    if (matches.size == 0) {
      throw InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bNoMatchException("InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bAmbiguityException("InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches._0Matches -> InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b._0(id = requireNotNull(matches.id), type = requireNotNull(matches.type), raw = rawObject)
      matches._1Matches -> InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b._1(number = requireNotNull(matches.number), owner = requireNotNull(matches.owner), repo = requireNotNull(matches.repo), type = requireNotNull(matches.type), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b) {
    encoder.requireJsonEncoder("InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b").encodeJsonElement(value.raw)
  }
}

internal data class InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bInspection(
  public val id: Int?,
  public val idDecoded: Boolean,
  public val type: InlineOrgsProjectsV2ItemsPostRequestJsonTypeX83a33ad6?,
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

private fun inspectInlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9b(rawObject: JsonObject): InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bInspection {
  val idResult = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val id = idResult?.getOrNull()
  val idDecoded = idResult?.isSuccess == true
  val typeResult = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOrgsProjectsV2ItemsPostRequestJsonTypeX83a33ad6>(element) } }
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
  return InlineOrgsProjectsV2ItemsPostRequestJsonX668f4d9bInspection(
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

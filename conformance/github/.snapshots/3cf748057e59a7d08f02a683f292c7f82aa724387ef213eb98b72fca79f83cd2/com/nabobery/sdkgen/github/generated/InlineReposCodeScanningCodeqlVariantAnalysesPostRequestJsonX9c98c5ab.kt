package com.nabobery.sdkgen.github.generated

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

public sealed class InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abDecodingException(
  message: String,
) : SerializationException(message)

public class InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abNoMatchException(
  message: String,
) : InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abDecodingException(message)

public class InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abAmbiguityException(
  message: String,
) : InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abDecodingException(message)

public class InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abBranchValidationException(
  message: String,
) : InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abDecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1code-scanning~1codeql~1variant-analyses/post/requestBod
 * y/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1code-scanning~1codeql~1variant-analyses/post/requestBod
 * y/content/application~1json/schema
 */
@Serializable(with = InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab.Serializer::class)
public sealed interface InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class _0 internal constructor(
    public val language: CodeScanningVariantAnalysisLanguage,
    public val queryPack: String,
    public val repositories: List<String>,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        language: CodeScanningVariantAnalysisLanguage,
        queryPack: String,
        repositories: List<String>,
      ): _0 {
        val raw = buildJsonObject {
              put("language", SdkJson.encodeToJsonElement(language))
              put("query_pack", queryPack)
              put("repositories", SdkJson.encodeToJsonElement(repositories))
            }
        val inspection = inspectInlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab(raw)
        if (inspection.size == 0) {
          throw InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abNoMatchException("InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection._0Matches) {
          throw InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abBranchValidationException("_0 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abAmbiguityException("InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return _0(
          language = language,
          queryPack = queryPack,
          repositories = repositories,
          raw = raw,
        )
      }
    }
  }

  public class _1 internal constructor(
    public val language: CodeScanningVariantAnalysisLanguage,
    public val queryPack: String,
    public val repositoryLists: List<String>,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        language: CodeScanningVariantAnalysisLanguage,
        queryPack: String,
        repositoryLists: List<String>,
      ): _1 {
        val raw = buildJsonObject {
              put("language", SdkJson.encodeToJsonElement(language))
              put("query_pack", queryPack)
              put("repository_lists", SdkJson.encodeToJsonElement(repositoryLists))
            }
        val inspection = inspectInlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab(raw)
        if (inspection.size == 0) {
          throw InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abNoMatchException("InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection._1Matches) {
          throw InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abBranchValidationException("_1 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abAmbiguityException("InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return _1(
          language = language,
          queryPack = queryPack,
          repositoryLists = repositoryLists,
          raw = raw,
        )
      }
    }
  }

  public class _2 internal constructor(
    public val language: CodeScanningVariantAnalysisLanguage,
    public val queryPack: String,
    public val repositoryOwners: List<String>,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        language: CodeScanningVariantAnalysisLanguage,
        queryPack: String,
        repositoryOwners: List<String>,
      ): _2 {
        val raw = buildJsonObject {
              put("language", SdkJson.encodeToJsonElement(language))
              put("query_pack", queryPack)
              put("repository_owners", SdkJson.encodeToJsonElement(repositoryOwners))
            }
        val inspection = inspectInlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab(raw)
        if (inspection.size == 0) {
          throw InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abNoMatchException("InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection._2Matches) {
          throw InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abBranchValidationException("_2 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abAmbiguityException("InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return _2(
          language = language,
          queryPack = queryPack,
          repositoryOwners = repositoryOwners,
          raw = raw,
        )
      }
    }
  }

  public object Serializer : KSerializer<InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab")
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abNoMatchException("InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab matched 0 branches: expected JSON object")
      val matches = inspectInlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab(rawObject)
      if (matches.size == 0) {
        throw InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abNoMatchException("InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abAmbiguityException("InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches._0Matches -> _0(language = requireNotNull(matches.language), queryPack = requireNotNull(matches.queryPack), repositories = requireNotNull(matches.repositories), raw = rawObject)
        matches._1Matches -> _1(language = requireNotNull(matches.language), queryPack = requireNotNull(matches.queryPack), repositoryLists = requireNotNull(matches.repositoryLists), raw = rawObject)
        matches._2Matches -> _2(language = requireNotNull(matches.language), queryPack = requireNotNull(matches.queryPack), repositoryOwners = requireNotNull(matches.repositoryOwners), raw = rawObject)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab) {
      encoder.requireJsonEncoder("InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab").encodeJsonElement(value.raw)
    }
  }
}

internal data class InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abInspection(
  public val repositories: List<String>?,
  public val repositoriesDecoded: Boolean,
  public val language: CodeScanningVariantAnalysisLanguage?,
  public val languageDecoded: Boolean,
  public val languageMatches: Boolean,
  public val queryPack: String?,
  public val queryPackDecoded: Boolean,
  public val repositoryLists: List<String>?,
  public val repositoryListsDecoded: Boolean,
  public val repositoryOwners: List<String>?,
  public val repositoryOwnersDecoded: Boolean,
  public val _0Matches: Boolean,
  public val _1Matches: Boolean,
  public val _2Matches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (_0Matches) add("_0")
      if (_1Matches) add("_1")
      if (_2Matches) add("_2")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5ab(rawObject: JsonObject): InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abInspection {
  val repositoriesResult = rawObject["repositories"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<String>>(element) } }
  val repositories = repositoriesResult?.getOrNull()
  val repositoriesDecoded = repositoriesResult?.isSuccess == true
  val languageResult = rawObject["language"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<CodeScanningVariantAnalysisLanguage>(element) } }
  val language = languageResult?.getOrNull()
  val languageDecoded = languageResult?.isSuccess == true
  val languageMatches = (rawObject.stringValue("language") == "actions" || rawObject.stringValue("language") == "cpp" || rawObject.stringValue("language") == "csharp" || rawObject.stringValue("language") == "go" || rawObject.stringValue("language") == "java" || rawObject.stringValue("language") == "javascript" || rawObject.stringValue("language") == "python" || rawObject.stringValue("language") == "ruby" || rawObject.stringValue("language") == "rust" || rawObject.stringValue("language") == "swift") && languageDecoded
  val queryPackResult = rawObject["query_pack"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val queryPack = queryPackResult?.getOrNull()
  val queryPackDecoded = queryPackResult?.isSuccess == true
  val repositoryListsResult = rawObject["repository_lists"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<String>>(element) } }
  val repositoryLists = repositoryListsResult?.getOrNull()
  val repositoryListsDecoded = repositoryListsResult?.isSuccess == true
  val repositoryOwnersResult = rawObject["repository_owners"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<String>>(element) } }
  val repositoryOwners = repositoryOwnersResult?.getOrNull()
  val repositoryOwnersDecoded = repositoryOwnersResult?.isSuccess == true
  val rawEmpty = rawObject.isEmpty()
  val _0Matches = repositoriesDecoded
  val _1Matches = repositoryListsDecoded
  val _2Matches = repositoryOwnersDecoded
  return InlineReposCodeScanningCodeqlVariantAnalysesPostRequestJsonX9c98c5abInspection(
    repositories = repositories,
    repositoriesDecoded = repositoriesDecoded,
    language = language,
    languageDecoded = languageDecoded,
    languageMatches = languageMatches,
    queryPack = queryPack,
    queryPackDecoded = queryPackDecoded,
    repositoryLists = repositoryLists,
    repositoryListsDecoded = repositoryListsDecoded,
    repositoryOwners = repositoryOwners,
    repositoryOwnersDecoded = repositoryOwnersDecoded,
    _0Matches = _0Matches,
    _1Matches = _1Matches,
    _2Matches = _2Matches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!_0Matches) add("_0: branch predicate did not match properties 'repositories'")
      if (!_1Matches) add("_1: branch predicate did not match properties 'repository_lists'")
      if (!_2Matches) add("_2: branch predicate did not match properties 'repository_owners'")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}

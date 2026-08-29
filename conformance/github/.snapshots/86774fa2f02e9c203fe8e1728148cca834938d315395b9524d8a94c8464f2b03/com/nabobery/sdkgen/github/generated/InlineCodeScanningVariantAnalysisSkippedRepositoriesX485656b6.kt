package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Information about repositories that were skipped from processing. This information is only available to the user that
 * initiated the variant analysis.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-scanning-variant-analysis/properties/skipped_repositories
 */
@Serializable(with = InlineCodeScanningVariantAnalysisSkippedRepositoriesX485656b6.Serializer::class)
public class InlineCodeScanningVariantAnalysisSkippedRepositoriesX485656b6(
  public val accessMismatchRepos: CodeScanningVariantAnalysisSkippedRepoGroup,
  public val noCodeqlDbRepos: CodeScanningVariantAnalysisSkippedRepoGroup,
  public val notFoundRepos:
      InlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f,
  public val overLimitRepos: CodeScanningVariantAnalysisSkippedRepoGroup,
) {
  public class Builder {
    private var accessMismatchReposValue: CodeScanningVariantAnalysisSkippedRepoGroup? = null

    public var accessMismatchRepos: CodeScanningVariantAnalysisSkippedRepoGroup
      get() = requireNotNull(accessMismatchReposValue) { "accessMismatchRepos is required" }
      set(`value`) {
        accessMismatchReposValue = value
      }

    private var noCodeqlDbReposValue: CodeScanningVariantAnalysisSkippedRepoGroup? = null

    public var noCodeqlDbRepos: CodeScanningVariantAnalysisSkippedRepoGroup
      get() = requireNotNull(noCodeqlDbReposValue) { "noCodeqlDbRepos is required" }
      set(`value`) {
        noCodeqlDbReposValue = value
      }

    private var notFoundReposValue:
        InlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f? = null

    public var notFoundRepos:
        InlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f
      get() = requireNotNull(notFoundReposValue) { "notFoundRepos is required" }
      set(`value`) {
        notFoundReposValue = value
      }

    private var overLimitReposValue: CodeScanningVariantAnalysisSkippedRepoGroup? = null

    public var overLimitRepos: CodeScanningVariantAnalysisSkippedRepoGroup
      get() = requireNotNull(overLimitReposValue) { "overLimitRepos is required" }
      set(`value`) {
        overLimitReposValue = value
      }

    public fun build(): InlineCodeScanningVariantAnalysisSkippedRepositoriesX485656b6 {
      check(accessMismatchReposValue != null) { "accessMismatchRepos is required" }
      check(noCodeqlDbReposValue != null) { "noCodeqlDbRepos is required" }
      check(notFoundReposValue != null) { "notFoundRepos is required" }
      check(overLimitReposValue != null) { "overLimitRepos is required" }
      return InlineCodeScanningVariantAnalysisSkippedRepositoriesX485656b6(
        accessMismatchRepos = accessMismatchRepos,
        noCodeqlDbRepos = noCodeqlDbRepos,
        notFoundRepos = notFoundRepos,
        overLimitRepos = overLimitRepos,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCodeScanningVariantAnalysisSkippedRepositoriesX485656b6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCodeScanningVariantAnalysisSkippedRepositoriesX485656b6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCodeScanningVariantAnalysisSkippedRepositoriesX485656b6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCodeScanningVariantAnalysisSkippedRepositoriesX485656b6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCodeScanningVariantAnalysisSkippedRepositoriesX485656b6 must be a JSON object")
      val accessMismatchRepos = json.decodeRequired<CodeScanningVariantAnalysisSkippedRepoGroup>(rawObject, "access_mismatch_repos")
      val noCodeqlDbRepos = json.decodeRequired<CodeScanningVariantAnalysisSkippedRepoGroup>(rawObject, "no_codeql_db_repos")
      val notFoundRepos = json.decodeRequired<InlineCodeScanningVariantAnalysisSkippedRepositoriesNotFoundReposXcd1bf50f>(rawObject, "not_found_repos")
      val overLimitRepos = json.decodeRequired<CodeScanningVariantAnalysisSkippedRepoGroup>(rawObject, "over_limit_repos")
      return InlineCodeScanningVariantAnalysisSkippedRepositoriesX485656b6(
        accessMismatchRepos = accessMismatchRepos,
        noCodeqlDbRepos = noCodeqlDbRepos,
        notFoundRepos = notFoundRepos,
        overLimitRepos = overLimitRepos,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningVariantAnalysisSkippedRepositoriesX485656b6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCodeScanningVariantAnalysisSkippedRepositoriesX485656b6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("access_mismatch_repos", json.encodeToJsonElement(value.accessMismatchRepos))
        put("no_codeql_db_repos", json.encodeToJsonElement(value.noCodeqlDbRepos))
        put("not_found_repos", json.encodeToJsonElement(value.notFoundRepos))
        put("over_limit_repos", json.encodeToJsonElement(value.overLimitRepos))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCodeScanningVariantAnalysisSkippedRepositoriesX485656b6(block: InlineCodeScanningVariantAnalysisSkippedRepositoriesX485656b6.Builder.() -> Unit): InlineCodeScanningVariantAnalysisSkippedRepositoriesX485656b6 = InlineCodeScanningVariantAnalysisSkippedRepositoriesX485656b6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCodeScanningVariantAnalysisSkippedRepositoriesX485656b6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

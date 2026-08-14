package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * Branch With Protection
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/branch-with-protection
 */
@Serializable(with = BranchWithProtection.Serializer::class)
public class BranchWithProtection(
  public val links: InlineBranchWithProtectionLinksX8d975d3b,
  public val commit: Commit,
  public val name: String,
  public val `protected`: Boolean,
  public val protection: BranchProtection,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val protectionUrl: String,
  public val pattern: String? = null,
  public val requiredApprovingReviewCount: Int? = null,
) {
  public class Builder {
    private var linksValue: InlineBranchWithProtectionLinksX8d975d3b? = null

    public var links: InlineBranchWithProtectionLinksX8d975d3b
      get() = requireNotNull(linksValue) { "links is required" }
      set(`value`) {
        linksValue = value
      }

    private var commitValue: Commit? = null

    public var commit: Commit
      get() = requireNotNull(commitValue) { "commit is required" }
      set(`value`) {
        commitValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var protectedValue: Boolean? = null

    public var `protected`: Boolean
      get() = requireNotNull(protectedValue) { "protected is required" }
      set(`value`) {
        protectedValue = value
      }

    private var protectionValue: BranchProtection? = null

    public var protection: BranchProtection
      get() = requireNotNull(protectionValue) { "protection is required" }
      set(`value`) {
        protectionValue = value
      }

    private var protectionUrlValue: String? = null

    public var protectionUrl: String
      get() = requireNotNull(protectionUrlValue) { "protectionUrl is required" }
      set(`value`) {
        protectionUrlValue = value
      }

    public var pattern: String? = null

    public var requiredApprovingReviewCount: Int? = null

    public fun build(): BranchWithProtection {
      check(linksValue != null) { "links is required" }
      check(commitValue != null) { "commit is required" }
      check(nameValue != null) { "name is required" }
      check(protectedValue != null) { "protected is required" }
      check(protectionValue != null) { "protection is required" }
      check(protectionUrlValue != null) { "protectionUrl is required" }
      return BranchWithProtection(
        links = links,
        commit = commit,
        name = name,
        protected = protected,
        protection = protection,
        protectionUrl = protectionUrl,
        pattern = pattern,
        requiredApprovingReviewCount = requiredApprovingReviewCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BranchWithProtection = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BranchWithProtection> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BranchWithProtection {
      val jsonDecoder = decoder.requireJsonDecoder("BranchWithProtection")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BranchWithProtection must be a JSON object")
      val links = json.decodeRequired<InlineBranchWithProtectionLinksX8d975d3b>(rawObject, "_links")
      val commit = json.decodeRequired<Commit>(rawObject, "commit")
      val name = json.decodeRequired<String>(rawObject, "name")
      val protected = json.decodeRequired<Boolean>(rawObject, "protected")
      val protection = json.decodeRequired<BranchProtection>(rawObject, "protection")
      val protectionUrl = json.decodeRequired<String>(rawObject, "protection_url")
      return BranchWithProtection(
        links = links,
        commit = commit,
        name = name,
        protected = protected,
        protection = protection,
        protectionUrl = protectionUrl,
        pattern = rawObject["pattern"]?.let { json.decodeFromJsonElement<String>(it) },
        requiredApprovingReviewCount = rawObject["required_approving_review_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BranchWithProtection) {
      val jsonEncoder = encoder.requireJsonEncoder("BranchWithProtection")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("_links", json.encodeToJsonElement(value.links))
        put("commit", json.encodeToJsonElement(value.commit))
        put("name", value.name)
        put("protected", json.encodeToJsonElement(value.protected))
        put("protection", json.encodeToJsonElement(value.protection))
        put("protection_url", value.protectionUrl)
        value.pattern?.let { put("pattern", it) }
        value.requiredApprovingReviewCount?.let { put("required_approving_review_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun branchWithProtection(block: BranchWithProtection.Builder.() -> Unit): BranchWithProtection = BranchWithProtection.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BranchWithProtection is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

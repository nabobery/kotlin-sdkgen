package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/selected-actions.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/selected-actions
 */
@Serializable(with = SelectedActions.Serializer::class)
public class SelectedActions(
  /**
   * Whether GitHub-owned actions are allowed. For example, this includes the actions in the `actions` organization.
   */
  public val githubOwnedAllowed: Boolean? = null,
  patternsAllowed: List<String>? = null,
  /**
   * Whether actions from GitHub Marketplace verified creators are allowed. Set to `true` to allow all actions by GitHub
   * Marketplace verified creators.
   */
  public val verifiedAllowed: Boolean? = null,
) {
  /**
   * Specifies a list of string-matching patterns to allow specific action(s) and reusable workflow(s). Wildcards, tags,
   * and SHAs are allowed. For example, `monalisa/octocat@*`, `monalisa/octocat@v2`, `monalisa/&#42;`.
   *
   * > [!NOTE]
   * > The `patterns_allowed` setting only applies to public repositories.
   */
  public val patternsAllowed: List<String>? =
      patternsAllowed?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Whether GitHub-owned actions are allowed. For example, this includes the actions in the `actions` organization.
     */
    public var githubOwnedAllowed: Boolean? = null

    private var patternsAllowedValue: List<String>? = null

    /**
     * Specifies a list of string-matching patterns to allow specific action(s) and reusable workflow(s). Wildcards,
     * tags, and SHAs are allowed. For example, `monalisa/octocat@*`, `monalisa/octocat@v2`, `monalisa/&#42;`.
     *
     * > [!NOTE]
     * > The `patterns_allowed` setting only applies to public repositories.
     */
    public var patternsAllowed: List<String>?
      get() = patternsAllowedValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        patternsAllowedValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Whether actions from GitHub Marketplace verified creators are allowed. Set to `true` to allow all actions by
     * GitHub Marketplace verified creators.
     */
    public var verifiedAllowed: Boolean? = null

    public fun build(): SelectedActions = SelectedActions(
      githubOwnedAllowed = githubOwnedAllowed,
      patternsAllowed = patternsAllowed,
      verifiedAllowed = verifiedAllowed,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SelectedActions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SelectedActions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SelectedActions {
      val jsonDecoder = decoder.requireJsonDecoder("SelectedActions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SelectedActions must be a JSON object")
      return SelectedActions(
        githubOwnedAllowed = rawObject["github_owned_allowed"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        patternsAllowed = rawObject["patterns_allowed"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        verifiedAllowed = rawObject["verified_allowed"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SelectedActions) {
      val jsonEncoder = encoder.requireJsonEncoder("SelectedActions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.githubOwnedAllowed?.let { put("github_owned_allowed", json.encodeToJsonElement(it)) }
        value.patternsAllowed?.let { put("patterns_allowed", json.encodeToJsonElement(it)) }
        value.verifiedAllowed?.let { put("verified_allowed", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun selectedActions(block: SelectedActions.Builder.() -> Unit): SelectedActions = SelectedActions.build(block)

package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1forks/post/requestBody/content/application~1json/schema
 * .
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1forks/post/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposForksPostRequestJsonX082ac693.Serializer::class)
public class InlineReposForksPostRequestJsonX082ac693(
  /**
   * When forking from an existing repository, fork with only the default branch.
   */
  public val defaultBranchOnly: Boolean? = null,
  /**
   * When forking from an existing repository, a new name for the fork.
   */
  public val name: String? = null,
  /**
   * Optional parameter to specify the organization name if forking into an organization.
   */
  public val organization: String? = null,
) {
  public class Builder {
    /**
     * When forking from an existing repository, fork with only the default branch.
     */
    public var defaultBranchOnly: Boolean? = null

    /**
     * When forking from an existing repository, a new name for the fork.
     */
    public var name: String? = null

    /**
     * Optional parameter to specify the organization name if forking into an organization.
     */
    public var organization: String? = null

    public fun build(): InlineReposForksPostRequestJsonX082ac693 = InlineReposForksPostRequestJsonX082ac693(
      defaultBranchOnly = defaultBranchOnly,
      name = name,
      organization = organization,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposForksPostRequestJsonX082ac693 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposForksPostRequestJsonX082ac693> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposForksPostRequestJsonX082ac693 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposForksPostRequestJsonX082ac693")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposForksPostRequestJsonX082ac693 must be a JSON object")
      return InlineReposForksPostRequestJsonX082ac693(
        defaultBranchOnly = rawObject["default_branch_only"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposForksPostRequestJsonX082ac693) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposForksPostRequestJsonX082ac693")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.defaultBranchOnly?.let { put("default_branch_only", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.organization?.let { put("organization", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposForksPostRequestJsonX082ac693(block: InlineReposForksPostRequestJsonX082ac693.Builder.() -> Unit): InlineReposForksPostRequestJsonX082ac693 = InlineReposForksPostRequestJsonX082ac693.build(block)

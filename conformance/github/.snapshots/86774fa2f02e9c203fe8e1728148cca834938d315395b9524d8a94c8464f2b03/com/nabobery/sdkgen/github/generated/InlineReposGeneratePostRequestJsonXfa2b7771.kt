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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{template_owner}~1{template_repo}~1generate/post/requestBody/content/app
 * lication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{template_owner}~1{template_repo}~1generate/post/requestBody/content/app
 * lication~1json/schema
 */
@Serializable(with = InlineReposGeneratePostRequestJsonXfa2b7771.Serializer::class)
public class InlineReposGeneratePostRequestJsonXfa2b7771(
  /**
   * The name of the new repository.
   */
  public val name: String,
  /**
   * A short description of the new repository.
   */
  public val description: String? = null,
  /**
   * Set to `true` to include the directory structure and files from all branches in the template repository, and not
   * just the default branch. Default: `false`.
   */
  public val includeAllBranches: Boolean? = null,
  /**
   * The organization or person who will own the new repository. To create a new repository in an organization, the
   * authenticated user must be a member of the specified organization.
   */
  public val owner: String? = null,
  /**
   * Either `true` to create a new private repository or `false` to create a new public one.
   */
  public val `private`: Boolean? = null,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * A short description of the new repository.
     */
    public var description: String? = null

    /**
     * Set to `true` to include the directory structure and files from all branches in the template repository, and not
     * just the default branch. Default: `false`.
     */
    public var includeAllBranches: Boolean? = null

    /**
     * The organization or person who will own the new repository. To create a new repository in an organization, the
     * authenticated user must be a member of the specified organization.
     */
    public var owner: String? = null

    /**
     * Either `true` to create a new private repository or `false` to create a new public one.
     */
    public var `private`: Boolean? = null

    public fun build(): InlineReposGeneratePostRequestJsonXfa2b7771 {
      check(nameValue != null) { "name is required" }
      return InlineReposGeneratePostRequestJsonXfa2b7771(
        name = name,
        description = description,
        includeAllBranches = includeAllBranches,
        owner = owner,
        private = private,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposGeneratePostRequestJsonXfa2b7771 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposGeneratePostRequestJsonXfa2b7771> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposGeneratePostRequestJsonXfa2b7771 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposGeneratePostRequestJsonXfa2b7771")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposGeneratePostRequestJsonXfa2b7771 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineReposGeneratePostRequestJsonXfa2b7771(
        name = name,
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        includeAllBranches = rawObject["include_all_branches"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        owner = rawObject["owner"]?.let { json.decodeFromJsonElement<String>(it) },
        private = rawObject["private"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposGeneratePostRequestJsonXfa2b7771) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposGeneratePostRequestJsonXfa2b7771")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        value.description?.let { put("description", it) }
        value.includeAllBranches?.let { put("include_all_branches", json.encodeToJsonElement(it)) }
        value.owner?.let { put("owner", it) }
        value.private?.let { put("private", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposGeneratePostRequestJsonXfa2b7771(block: InlineReposGeneratePostRequestJsonXfa2b7771.Builder.() -> Unit): InlineReposGeneratePostRequestJsonXfa2b7771 = InlineReposGeneratePostRequestJsonXfa2b7771.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposGeneratePostRequestJsonXfa2b7771 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

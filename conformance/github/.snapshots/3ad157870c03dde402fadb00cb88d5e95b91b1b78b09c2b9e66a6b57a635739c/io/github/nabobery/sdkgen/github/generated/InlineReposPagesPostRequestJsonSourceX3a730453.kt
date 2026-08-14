package io.github.nabobery.sdkgen.github.generated

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
 * The source branch and directory used to publish your Pages site.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pages/post/requestBody/content/application~1json/schema
 * /properties/source
 */
@Serializable(with = InlineReposPagesPostRequestJsonSourceX3a730453.Serializer::class)
public class InlineReposPagesPostRequestJsonSourceX3a730453(
  /**
   * The repository branch used to publish your site's source files.
   */
  public val branch: String,
  /**
   * The repository directory that includes the source files for the Pages site. Allowed paths are `/` or `/docs`.
   * Default: `/`
   */
  public val path: InlineReposPagesPostRequestJsonSourcePathX5fa95bf6? = null,
) {
  public class Builder {
    private var branchValue: String? = null

    public var branch: String
      get() = requireNotNull(branchValue) { "branch is required" }
      set(`value`) {
        branchValue = value
      }

    /**
     * The repository directory that includes the source files for the Pages site. Allowed paths are `/` or `/docs`.
     * Default: `/`
     */
    public var path: InlineReposPagesPostRequestJsonSourcePathX5fa95bf6? = null

    public fun build(): InlineReposPagesPostRequestJsonSourceX3a730453 {
      check(branchValue != null) { "branch is required" }
      return InlineReposPagesPostRequestJsonSourceX3a730453(
        branch = branch,
        path = path,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPagesPostRequestJsonSourceX3a730453 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposPagesPostRequestJsonSourceX3a730453> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPagesPostRequestJsonSourceX3a730453 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPagesPostRequestJsonSourceX3a730453")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPagesPostRequestJsonSourceX3a730453 must be a JSON object")
      val branch = json.decodeRequired<String>(rawObject, "branch")
      return InlineReposPagesPostRequestJsonSourceX3a730453(
        branch = branch,
        path = rawObject["path"]?.let { json.decodeFromJsonElement<InlineReposPagesPostRequestJsonSourcePathX5fa95bf6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPagesPostRequestJsonSourceX3a730453) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPagesPostRequestJsonSourceX3a730453")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("branch", value.branch)
        value.path?.let { put("path", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPagesPostRequestJsonSourceX3a730453(block: InlineReposPagesPostRequestJsonSourceX3a730453.Builder.() -> Unit): InlineReposPagesPostRequestJsonSourceX3a730453 = InlineReposPagesPostRequestJsonSourceX3a730453.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposPagesPostRequestJsonSourceX3a730453 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

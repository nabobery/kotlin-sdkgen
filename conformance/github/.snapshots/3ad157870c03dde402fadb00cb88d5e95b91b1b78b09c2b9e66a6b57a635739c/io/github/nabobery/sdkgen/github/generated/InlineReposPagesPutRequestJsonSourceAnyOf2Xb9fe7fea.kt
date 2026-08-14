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
 * Update the source for the repository. Must include the branch name and path.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pages/put/requestBody/content/application~1json/schema/
 * properties/source/anyOf/1
 */
@Serializable(with = InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea.Serializer::class)
public class InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea(
  /**
   * The repository branch used to publish your site's source files.
   */
  public val branch: String,
  /**
   * The repository directory that includes the source files for the Pages site. Allowed paths are `/` or `/docs`.
   */
  public val path: InlineReposPagesPutRequestJsonSourceAnyOf2PathX9b6629d7,
) {
  public class Builder {
    private var branchValue: String? = null

    public var branch: String
      get() = requireNotNull(branchValue) { "branch is required" }
      set(`value`) {
        branchValue = value
      }

    private var pathValue: InlineReposPagesPutRequestJsonSourceAnyOf2PathX9b6629d7? = null

    public var path: InlineReposPagesPutRequestJsonSourceAnyOf2PathX9b6629d7
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    public fun build(): InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea {
      check(branchValue != null) { "branch is required" }
      check(pathValue != null) { "path is required" }
      return InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea(
        branch = branch,
        path = path,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea must be a JSON object")
      val branch = json.decodeRequired<String>(rawObject, "branch")
      val path = json.decodeRequired<InlineReposPagesPutRequestJsonSourceAnyOf2PathX9b6629d7>(rawObject, "path")
      return InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea(
        branch = branch,
        path = path,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("branch", value.branch)
        put("path", json.encodeToJsonElement(value.path))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea(block: InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea.Builder.() -> Unit): InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea = InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposPagesPutRequestJsonSourceAnyOf2Xb9fe7fea is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

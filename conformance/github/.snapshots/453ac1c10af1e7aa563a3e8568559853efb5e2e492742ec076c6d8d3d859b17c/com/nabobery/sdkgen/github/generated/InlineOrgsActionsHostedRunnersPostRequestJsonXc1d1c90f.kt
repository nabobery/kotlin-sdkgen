package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners/post/requestBody/content/application~1json
 * /schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners/post/requestBody/content/application~1json
 * /schema
 */
@Serializable(with = InlineOrgsActionsHostedRunnersPostRequestJsonXc1d1c90f.Serializer::class)
public class InlineOrgsActionsHostedRunnersPostRequestJsonXc1d1c90f(
  /**
   * The image of runner. To list all available images, use `GET /actions/hosted-runners/images/github-owned` or `GET
   * /actions/hosted-runners/images/partner`.
   */
  public val image: InlineOrgsActionsHostedRunnersPostRequestJsonImageX5da17085,
  /**
   * Name of the runner. Must be between 1 and 64 characters and may only contain upper and lowercase letters a-z,
   * numbers 0-9, '.', '-', and '_'.
   */
  public val name: String,
  /**
   * The existing runner group to add this runner to.
   */
  public val runnerGroupId: Int,
  /**
   * The machine size of the runner. To list available sizes, use `GET actions/hosted-runners/machine-sizes`
   */
  public val size: String,
  /**
   * Whether this runner should be created with a static public IP. Note limit on account. To list limits on account,
   * use `GET actions/hosted-runners/limits`
   */
  public val enableStaticIp: Boolean? = null,
  /**
   * Whether this runner should be used to generate custom images.
   */
  public val imageGen: Boolean? = null,
  /**
   * The maximum amount of runners to scale up to. Runners will not auto-scale above this number. Use this setting to
   * limit your cost.
   */
  public val maximumRunners: Int? = null,
) {
  public class Builder {
    private var imageValue: InlineOrgsActionsHostedRunnersPostRequestJsonImageX5da17085? = null

    public var image: InlineOrgsActionsHostedRunnersPostRequestJsonImageX5da17085
      get() = requireNotNull(imageValue) { "image is required" }
      set(`value`) {
        imageValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var runnerGroupIdValue: Int? = null

    public var runnerGroupId: Int
      get() = requireNotNull(runnerGroupIdValue) { "runnerGroupId is required" }
      set(`value`) {
        runnerGroupIdValue = value
      }

    private var sizeValue: String? = null

    public var size: String
      get() = requireNotNull(sizeValue) { "size is required" }
      set(`value`) {
        sizeValue = value
      }

    /**
     * Whether this runner should be created with a static public IP. Note limit on account. To list limits on account,
     * use `GET actions/hosted-runners/limits`
     */
    public var enableStaticIp: Boolean? = null

    /**
     * Whether this runner should be used to generate custom images.
     */
    public var imageGen: Boolean? = null

    /**
     * The maximum amount of runners to scale up to. Runners will not auto-scale above this number. Use this setting to
     * limit your cost.
     */
    public var maximumRunners: Int? = null

    public fun build(): InlineOrgsActionsHostedRunnersPostRequestJsonXc1d1c90f {
      check(imageValue != null) { "image is required" }
      check(nameValue != null) { "name is required" }
      check(runnerGroupIdValue != null) { "runnerGroupId is required" }
      check(sizeValue != null) { "size is required" }
      return InlineOrgsActionsHostedRunnersPostRequestJsonXc1d1c90f(
        image = image,
        name = name,
        runnerGroupId = runnerGroupId,
        size = size,
        enableStaticIp = enableStaticIp,
        imageGen = imageGen,
        maximumRunners = maximumRunners,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsHostedRunnersPostRequestJsonXc1d1c90f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsActionsHostedRunnersPostRequestJsonXc1d1c90f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsHostedRunnersPostRequestJsonXc1d1c90f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsHostedRunnersPostRequestJsonXc1d1c90f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsHostedRunnersPostRequestJsonXc1d1c90f must be a JSON object")
      val image = json.decodeRequired<InlineOrgsActionsHostedRunnersPostRequestJsonImageX5da17085>(rawObject, "image")
      val name = json.decodeRequired<String>(rawObject, "name")
      val runnerGroupId = json.decodeRequired<Int>(rawObject, "runner_group_id")
      val size = json.decodeRequired<String>(rawObject, "size")
      return InlineOrgsActionsHostedRunnersPostRequestJsonXc1d1c90f(
        image = image,
        name = name,
        runnerGroupId = runnerGroupId,
        size = size,
        enableStaticIp = rawObject["enable_static_ip"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        imageGen = rawObject["image_gen"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        maximumRunners = rawObject["maximum_runners"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsHostedRunnersPostRequestJsonXc1d1c90f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsHostedRunnersPostRequestJsonXc1d1c90f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("image", json.encodeToJsonElement(value.image))
        put("name", value.name)
        put("runner_group_id", json.encodeToJsonElement(value.runnerGroupId))
        put("size", value.size)
        value.enableStaticIp?.let { put("enable_static_ip", json.encodeToJsonElement(it)) }
        value.imageGen?.let { put("image_gen", json.encodeToJsonElement(it)) }
        value.maximumRunners?.let { put("maximum_runners", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsHostedRunnersPostRequestJsonXc1d1c90f(block: InlineOrgsActionsHostedRunnersPostRequestJsonXc1d1c90f.Builder.() -> Unit): InlineOrgsActionsHostedRunnersPostRequestJsonXc1d1c90f = InlineOrgsActionsHostedRunnersPostRequestJsonXc1d1c90f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsHostedRunnersPostRequestJsonXc1d1c90f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

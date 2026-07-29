package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Feature options for Automatic dependency submission
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1code-security~1configurations/post/requestBody/conte
 * nt/application~1json/schema/properties/dependency_graph_autosubmit_action_options
 */
@Serializable(with = InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutosfecdX023e183a.Serializer::class)
public class InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutosfecdX023e183a(
  /**
   * Whether to use runners labeled with 'dependency-submission' or standard GitHub runners.
   */
  public val labeledRunners: Boolean? = null,
) {
  public class Builder {
    /**
     * Whether to use runners labeled with 'dependency-submission' or standard GitHub runners.
     */
    public var labeledRunners: Boolean? = null

    public fun build(): InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutosfecdX023e183a = InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutosfecdX023e183a(
      labeledRunners = labeledRunners,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutosfecdX023e183a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutosfecdX023e183a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutosfecdX023e183a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutosfecdX023e183a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutosfecdX023e183a must be a JSON object")
      return InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutosfecdX023e183a(
        labeledRunners = rawObject["labeled_runners"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutosfecdX023e183a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutosfecdX023e183a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.labeledRunners?.let { put("labeled_runners", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutosfecdX023e183a(block: InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutosfecdX023e183a.Builder.() -> Unit): InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutosfecdX023e183a = InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutosfecdX023e183a.build(block)
